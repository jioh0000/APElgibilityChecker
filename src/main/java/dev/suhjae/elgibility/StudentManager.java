package dev.suhjae.elgibility;

import dev.suhjae.elgibility.model.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jay", "jwsuh25@kis.ac", "12345", 9, 3.5, 3, new ArrayList<>(), 1600, 800, 800, 1600, 800, 800));
        students.add(new Student("Alice", "jhchoi25@kis.ac", "22222", 8, 3.5, 3, new ArrayList<>(), 1600, 800, 800, 1600, 800, 800));
        students.add(new Student("Hyerin", "hrshin25@kis.ac", "12345", 11, 3.5, 3, new ArrayList<>(), 1600, 800, 800, 1600, 800, 800));
        students.add(new Student("Erri", "erri25@kis.ac", "12345", 12, 3.5, 3, new ArrayList<>(), 1600, 800, 800, 1600, 800, 800));
        students.add(new Student("lllll", "lllll25@kis.ac", "44444", 11, 3.5, 3, new ArrayList<>(), 1600, 800, 800, 1600, 800, 800));

        return students;
    }
}