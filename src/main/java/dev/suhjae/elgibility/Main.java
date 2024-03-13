package dev.suhjae.elgibility;

import dev.suhjae.elgibility.model.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Get all the students (arraylist)
        ArrayList<Student> students = StudentManager.getStudentList();
    }
}
