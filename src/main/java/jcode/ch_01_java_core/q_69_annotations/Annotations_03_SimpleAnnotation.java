package jcode.ch_01_java_core.q_69_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SimpleType
public class Annotations_03_SimpleAnnotation {

    public static void main(String[] args) {

        @SimpleLocal
        int local = 123;
    }

}

@Target(ElementType.PACKAGE)
@interface SimplePackage {

    String info() default "";
}

@Target(ElementType.TYPE)
@interface SimpleType {

    String info() default "";
}

@Target(ElementType.LOCAL_VARIABLE)
@interface SimpleLocal {

    String info() default "";
}
