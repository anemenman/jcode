package jcode.ch_01_java_core.q_78_jmx;

import java.lang.management.ManagementFactory;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

/**
 * Run example: 1) start main 2) jconsole 3) select local process for class->
 * jcode.ch_01_java_core.q_78_jmx.JMX_01_MBean_MBeanServer
 */
public class JMX_01_MBean_MBeanServer {

  public static void main(String[] args)
      throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException,
      MBeanRegistrationException, InterruptedException {

    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
    ObjectName name = new ObjectName(
        "jcode.ch_01_java_core.q_78_jmx:type=Mye");//Unique name of the MBean
    My mbean = new My();
    mbs.registerMBean(mbean, name);

    System.out.println("Waiting forever...");
    Thread.sleep(Long.MAX_VALUE);
  }
}
