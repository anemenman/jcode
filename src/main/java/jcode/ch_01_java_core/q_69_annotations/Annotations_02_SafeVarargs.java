package jcode.ch_01_java_core.q_69_annotations;

import java.util.ArrayList;
import java.util.List;

public class Annotations_02_SafeVarargs {

  public static <T> T[] unsafe(T... elements) {
    return elements; // unsafe! don't ever return a parameterized varargs array
  }

  public static <T> T[] broken(T seed) {
    T[] plant = unsafe(seed, seed, seed); // broken! This will be an Object[] no matter what T is
    return plant;
  }

  public static void plant() {
    String[] plants = broken("seed"); // ClassCastException
  }

  public static void main(String[] args) {
//    plant();

    Machine<String> machine = new Machine<>();
    machine.safe("a", "b", "c");
    System.out.println(machine.getVersions());
  }
}

class Machine<T> {

  private List<T> versions = new ArrayList<>();

  //  @SafeVarargs
  public final void safe(T... toAdd) {
    for (T version : toAdd) {
      versions.add(version);
    }
  }

  public List<T> getVersions() {
    return versions;
  }
}
