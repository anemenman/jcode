package jcode.ch_03_java_8.q_74_optional;

import java.util.Optional;

public class Optional_01 {

  public static void main(String[] args) {
    Optional<String> optional = Optional.of("a");
//    Optional<String> optionalNull = Optional.of(null);//java.lang.NullPointerException
    Optional<String> optionalNull = Optional.ofNullable(null);

    System.out.println(optional.isPresent());
    System.out.println(optionalNull.isPresent());

    System.out.println(optional.orElse("empty"));
    System.out.println(optionalNull.orElse("empty"));

    System.out.println(optionalNull.orElseGet(() -> "orElseGet"));

    System.out.println(
        optional.map(x -> x != null ? String.valueOf(x.hashCode()) : "0").orElse("map or else"));
  }

}
