package jcode.ch_01_java_core.q_54_strings;

public class String_05_StringPool {

  public static void main(String[] args) {
    String s1 = "a";
    String s2 = "a";//pool string
    String s3 = new String("a");//new string in memory
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);//false
//    System.out.println(s1.intern() == s3.intern()); //true

    s3 = s3.intern();
    System.out.println(s1 == s3);//true
  }

}
