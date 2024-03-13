package dev.suhjae.elgibility.model;

public class CourseRecord {
    private Course course = new Course("10110A", "AP Computer Science A", 9, true, 3.0, 0, 0, 0, false);
    int enrolledGradeLevel = 9;
    double GPA = 4.0;

    public CourseRecord(Course course, int enrolledGradeLevel, double GPA) {
        this.course = course;
        this.enrolledGradeLevel = enrolledGradeLevel;
        this.GPA = GPA;
    }

    public Course getCourse() {
        return course;
    }

    public int getEnrolledGradeLevel() {
        return enrolledGradeLevel;
    }

    public double getGPA() {
        return GPA;
    }

}
