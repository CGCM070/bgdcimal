package org.iesvdm.customAnnotation;

@Student
public class Clase  {
    String name;
    int age;
    String[] courses;

    public static void main(String[] args) {
        Clase clase = new Clase();
        Student student = clase.getClass().getAnnotation(Student.class);
        System.out.println("Name: " + student.name());

    }
}


