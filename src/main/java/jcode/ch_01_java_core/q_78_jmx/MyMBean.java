package jcode.ch_01_java_core.q_78_jmx;

//Name should ends by ...MBean
public interface MyMBean {

  String getMyName();

  void setSomeValue(int value1);

  int getSomeValue();

  void writeToConsole(String message);

  String concat(String str1, String str2);
}
