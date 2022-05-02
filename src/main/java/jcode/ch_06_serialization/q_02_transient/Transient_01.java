package jcode.ch_06_serialization.q_02_transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.time.LocalDate;

public class Transient_01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "user.ser";

        //создаем наш объект
        User user = new User();
        user.setFirstName("Stefan");
        user.setBirthDate(LocalDate.of(1991, 7, 16));
        user.setLogin("ssmith");
        user.setPassword("gemma_arterton_4ever_in_my_heart91");

        System.out.println("Initial user: " + user + "\r\n");


        serialize(user, path);
        User loadedUser = deserialize(path);
        System.out.println("Loaded user from file: " + loadedUser + "\r\n");
    }

    static void serialize(User user, String path) throws IOException {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //создаем 2 потока для сериализации объекта и сохранения его в файл
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем объект в файл
            objectOutputStream.writeObject(user);
        } finally {
            // Закроем потоки в блоке finally
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    static User deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {

            //создаем 2 потока для десериализации объекта из файла
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            //загружаем объект из файла
            return (User) objectInputStream.readObject();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private LocalDate birthDate;
    private String login;
    private transient String password;
}