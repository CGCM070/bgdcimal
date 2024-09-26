package org.iesvdm.customAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented

public @interface Student {
    String name() default "Pepe";
    int age() default 18;
    String[] courses() default {"Math", "English"};


}
