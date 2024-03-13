package dev.suhjae.elgibility.model;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final String email;
    private final String ID;
    private final int GradeLevel;
    private double GPA;
    private int ApPredictedScore;
    private ArrayList<CourseRecord> EnrolledCourses;


    public Student(String name, String email, String ID, int GradeLevel, double GPA, int ApPredictedScore, ArrayList<CourseRecord> EnrolledCourses) {
        this.name = name;
        this.email = email;
        this.ID = ID;
        this.GradeLevel = GradeLevel;
        this.GPA = GPA;
        this.ApPredictedScore = ApPredictedScore;
        this.EnrolledCourses = EnrolledCourses;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getID() {
        return ID;
    }

    public int getGradeLevel() {
        return GradeLevel;
    }

    public double getGPA() {
        return GPA;
    }

    public int getApPredictedScore() {
        return ApPredictedScore;
    }

    public ArrayList<CourseRecord> getEnrolledCourses() {
        return new ArrayList<CourseRecord>();
    }

}

