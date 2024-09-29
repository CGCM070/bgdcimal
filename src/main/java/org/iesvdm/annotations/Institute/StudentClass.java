package org.iesvdm.annotations.Institute;

import java.util.Objects;

public class StudentClass {
    private String name;
    private String lastName;
    private String dateOfBirth;
    private int currentCourse;

    public StudentClass() {
    }

    public StudentClass(String name, String lastName, String dateOfBirth, int currentCourse) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.currentCourse = currentCourse;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCurrentCourse() {
        return currentCourse;
    }


    public StudentClass setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
        return this;
    }

    public StudentClass setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public StudentClass setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentClass setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", currentCourse=" + currentCourse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return currentCourse == that.currentCourse && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, dateOfBirth, currentCourse);
    }
}
