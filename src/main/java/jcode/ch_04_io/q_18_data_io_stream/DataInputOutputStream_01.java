package jcode.ch_04_io.q_18_data_io_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataInputOutputStream_01 {

  public static void main(String[] args) throws FileNotFoundException {

    A a = new A(1, "a", new ArrayList<>());

    try {
      DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("dos.txt"));
      dataOutputStream.writeUTF(a.getS());
      dataOutputStream.writeInt(a.getI());
    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}

class A {

  private Integer i;
  private String s;
  private List<String> list;

  A(Integer i, String s, List<String> list) {
    this.i = i;
    this.s = s;
    this.list = list;
  }

  public Integer getI() {
    return i;
  }

  public String getS() {
    return s;
  }

  public List<String> getList() {
    return list;
  }
}


