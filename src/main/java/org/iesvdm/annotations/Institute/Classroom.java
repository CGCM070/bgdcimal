package org.iesvdm.annotations.Institute;

import org.iesvdm.annotations.StudentAnnotation;

import java.util.ArrayList;
import java.util.List;


@StudentAnnotation(name = "Gabriel", lastName = "Garcia", dateOfBirth = "01/01/2000", currentCourse = 1)
@StudentAnnotation(name = "María", lastName = "Castel", dateOfBirth = "01/01/2000", currentCourse = 2)
@StudentAnnotation(name = "Juan", lastName = " Martínez", dateOfBirth = "01/01/2000", currentCourse = 3)
@StudentAnnotation(name = "Pedro", lastName = "Chavez", dateOfBirth = "01/01/2000", currentCourse = 4)
public class Classroom {

    List<StudentClass> students = new ArrayList<>();


    public Classroom() {
    }



    public List<StudentClass> getStudents() {
        return students;
    }

    public Classroom setStudents(List<StudentClass> students) {
        this.students = students;
        return this;
    }

    @Override
    public String toString() {
        return "Classroom{" +

                ", students=" + students +
                '}';
    }
}
