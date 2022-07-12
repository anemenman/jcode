package jcode.ch_06_serialization.q_06_externalizable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Base64;

public class Externalizable_01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Serialization...");

        FileOutputStream fileOutputStream = new FileOutputStream("serialization/save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov's passport data");

        objectOutputStream.writeObject(userInfo);

        objectOutputStream.close();

        System.out.println("Deserialization...");

        FileInputStream fileInputStream = new FileInputStream("serialization/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        UserInfo userInfo2 = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo2);

        objectInputStream.close();
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class UserInfo implements Externalizable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String superSecretInformation;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFirstName());
        out.writeObject(this.getLastName());
        out.writeObject(this.encryptString(this.getSuperSecretInformation()));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        superSecretInformation = this.decryptString((String) in.readObject());
    }

    private String encryptString(String data) {
        String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data) {
        String decrypted = new String(Base64.getDecoder().decode(data));
        System.out.println(decrypted);
        return decrypted;
    }
}
