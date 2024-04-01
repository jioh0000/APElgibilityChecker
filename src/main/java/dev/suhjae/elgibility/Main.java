package dev.suhjae.elgibility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Get all the students (arraylist)
        ArrayList<Student> students = StudentManager.getStudentList();
        ArrayList<Course> APCourses = dev.suhjae.elgibility.CourseManager.Main.getAllAP();

        /**
         for (Student student : students) {
         for (Course course : APCourses) {
         if (student.getGradeLevel() >= course.getMinGradeLevel()) {}
         if (student.getGPA() >= course.getMinGpaCutOff()) {}
         if (course.satReferenceBest()) { //Look for the best SAT score in the student's record
         }
         else { //Look for the latest SAT score in the student's record
         }
         }
         }
         /**/
    }
}
