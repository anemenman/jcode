package jcode.ch_01_java_core.q_69_annotations;

import static java.util.Collections.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Annotations_04_TypesInAnnotations {

}

@Target(ElementType.PACKAGE)
@interface T {

  String info() default "";

  int intVal() default 123;

  Class clazz() default String.class;

  int[] listInt();

  String[] listStr();

//  List<String> list1();

//  List<A> list();

//  A a(); Invalid type -> only primitives, String, Class, enum, annotations, <- array of above
}

class A {

}
