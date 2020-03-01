package jcode.ch_01_java_core.q_78_jmx;

/**
 * Class name should names My as follows interface MyMBean (Standard MBean)-> My+MBean
 * <p>
 * Otherwise there is an error occurred!!!
 * <p>
 * javax.management.NotCompliantMBeanException: MBean class jcode.ch_01_java_core.q_78_jmx.Mye does
 * not implement DynamicMBean, and neither follows the Standard MBean conventions
 * (javax.management.NotCompliantMBeanException: Class jcode.ch_01_java_core.q_78_jmx.Mye is not a
 * JMX compliant Standard MBean) nor the MXBean conventions (javax.management.NotCompliantMBeanException:
 * jcode.ch_01_java_core.q_78_jmx.Mye: Class jcode.ch_01_java_core.q_78_jmx.Mye is not a JMX
 * compliant MXBean)
 * <p>
 */
public class My implements MyMBean {

  private int someValue; // We can manage this value through JMX because setters/getters

  @Override
  public String getMyName() {
    return "JustMBeanName" + someValue;
  }

  @Override
  public void setSomeValue(int value1) {
    this.someValue = value1;
  }

  @Override
  public int getSomeValue() {
    return this.someValue;
  }

  @Override
  public void writeToConsole(String message) {
    System.out.println(message);
  }

  @Override
  public String concat(String str1, String str2) {
    return str1 + str2;
  }
}
