package dev.suhjae.elgibility.EligibilityManager;

import dev.suhjae.elgibility.CourseManager.Course;
import dev.suhjae.elgibility.CourseManager.CourseManager;
import dev.suhjae.elgibility.StudentManager.Student;
import dev.suhjae.elgibility.StudentManager.StudentManager;

import java.util.ArrayList;

public class EligibilityManager {
    CourseManager courseManager;
    StudentManager studentManager;
    ArrayList<Course> apCourses = new ArrayList<Course>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> eligibleCourses = new ArrayList<Course>();
    String eligibleCoursesList;
    String eligibleCoursesIdList;

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
        students = studentManager.studentList;
        apCourses = courseManager.getAPcourses();
        String[][] output = new String[students.size()][4];

        for(int i=0; i<students.size(); i++){
            eligibleCoursesList = "";
            eligibleCoursesIdList = "";
            eligibleCourses = getEligibleCourses(students.get(i));

            for(Course c : eligibleCourses){
                eligibleCoursesList += (c.getCourseName() + ", ");
                eligibleCoursesIdList += (c.getCourseID() + ", ");
            }

            output[i][0] = students.get(i).getName();
            output[i][1] = students.get(i).getID();
            output[i][2] = eligibleCoursesList.substring(0,eligibleCoursesList.length()-2);
            output[i][3] = eligibleCoursesIdList.substring(0,eligibleCoursesList.length()-2);

        }
        return output;
    }

}

