package dev.suhjae.elgibility.CourseManager;

import java.util.ArrayList;

public class Main {
    private final ArrayList<Course> apCourses;
    private final ArrayList<Course> courses;

    public Main() {
        this.apCourses = new ArrayList<>();
        this.apCourses.add(new Course("10110A", "AP Computer Science A", 9, true, 3.0, 0, 0, 0, false));
        this.apCourses.add(new Course("10110B", "AP Computer Science B", 9, true, 3.0, 0, 0, 0, false));
        this.apCourses.add(new Course("10110C", "AP Computer Science C", 9, true, 3.0, 0, 0, 0, false));
        this.apCourses.add(new Course("10110D", "AP Computer Science D", 9, true, 3.0, 0, 0, 0, false));
        this.apCourses.add(new Course("10110E", "AP Computer Science E", 9, true, 3.0, 0, 0, 0, false));
        this.apCourses.add(new Course("10110F", "AP Computer Science F", 9, true, 3.0, 0, 0, 0, false));

        this.courses = new ArrayList<>();
        this.courses.add(new Course("10110A", "EZ Calculus A", 9, false, 3.0, 0, 0, 0, false));
        this.courses.add(new Course("10110B", "EZ Calculus B", 9, false, 3.0, 0, 0, 0, false));
        this.courses.add(new Course("10110C", "EZ Calculus C", 9, false, 3.0, 0, 0, 0, false));
        this.courses.add(new Course("10110D", "EZ Calculus D", 9, false, 3.0, 0, 0, 0, false));
        this.courses.add(new Course("10110E", "EZ Calculus E", 9, false, 3.0, 0, 0, 0, false));
        this.courses.add(new Course("10110F", "EZ Calculus F", 9, false, 3.0, 0, 0, 0, false));
    }

    public static ArrayList<Course> getAllAP() {
        ArrayList<Course> apCourses = new ArrayList<>();
        apCourses.add(new Course("10110A", "AP Computer Science A", 9, true, 3.0, 0, 0, 0, false));
        apCourses.add(new Course("10110B", "AP Computer Science B", 9, true, 3.0, 0, 0, 0, false));
        apCourses.add(new Course("10110C", "AP Computer Science C", 9, true, 3.0, 0, 0, 0, false));
        apCourses.add(new Course("10110D", "AP Computer Science D", 9, true, 3.0, 0, 0, 0, false));
        apCourses.add(new Course("10110E", "AP Computer Science E", 9, true, 3.0, 0, 0, 0, false));
        apCourses.add(new Course("10110F", "AP Computer Science F", 9, true, 3.0, 0, 0, 0, false));

        return apCourses;
        //return new ArrayList<>(apCourses);
    }

    public ArrayList<Course> getAllCourse() {
        ArrayList<Course> allCourses = new ArrayList<>(courses);
        allCourses.addAll(apCourses);

        return allCourses;
    }
}
