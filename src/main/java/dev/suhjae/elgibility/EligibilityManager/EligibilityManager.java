package dev.suhjae.elgibility.EligibilityManager;

import dev.suhjae.elgibility.CourseManager.Course;
import dev.suhjae.elgibility.CourseManager.CourseManager;
import dev.suhjae.elgibility.StudentManager.Student;
import dev.suhjae.elgibility.StudentManager.StudentManager;

import java.util.ArrayList;

public class EligibilityManager {
    CourseManager courseManager;
    StudentManager studentManager;
    ArrayList<Course> apCourses;
    ArrayList<Student> students;

    private boolean checkCourseElegibility(Student student, Course course) {
        return true;
    }

    private ArrayList<Course> getEligibleCourses(Student student) {
        return null;
    }

    EligibilityManager(CourseManager cm, StudentManager sm) {
        this.courseManager = cm;
        this.studentManager = sm;
    }


    //Method that runs automatically
    public String[][] Go() {
        return null;
    }


}

