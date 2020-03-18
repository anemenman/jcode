package jcode.ch_02_collections.q_73_enumset;

import java.util.EnumSet;

public class EnumSet_01 {

  public static void main(String[] args) {
    /**
     * public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E>
     *     implements Cloneable, java.io.Serializable
     */
    EnumSet<E> enumSet = EnumSet.noneOf(E.class);
    System.out.println("enumSet--->" + enumSet);

    enumSet.add(E.A);
    enumSet.add(E.B);
//    enumSet.add(null); //--> NullPointerException

    System.out.println("enumSet--->" + enumSet);
  }

}

enum E {
  A, B, C
}
