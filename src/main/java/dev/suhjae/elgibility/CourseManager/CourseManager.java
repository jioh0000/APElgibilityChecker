package dev.suhjae.elgibility.CourseManager;

import java.util.ArrayList;

public class CourseManager {
    private String courseName;
    private int courseId;
    private int minGradeLevel;
    private String referencedTest;
    private boolean isHighest;
    private int minPredictorScore;
    private boolean isAP;

    static private ArrayList<Course> courses;
    ArrayList<Course> apCourses = new ArrayList<Course>();
    private String[][] data;

    public CourseManager(String[][] data) {
        this.data = data;
        courses = new ArrayList<Course>();
    }

    private void addCourse(String courseName, int courseId, int minGradeLevel, String referencedTest, boolean isHighest, int minPredictorScore, String preReqOne, String preReqTwo, String preReqThree, String preReqFour) {
        courses.add(new Course(courseName, courseId, minGradeLevel, referencedTest, isHighest, minPredictorScore, preReqOne, preReqTwo, preReqThree, preReqFour));
    }

    public void updateData(String[][] array) {
        //String courseName, int courseId, int minGradeLevel, String referencedTest, boolean isHighest, int minPredictorScore
        courses.clear();
        for (int i = 1; i < array.length; i++) {
            if (array[i][4].equals("Highest")) {
                isHighest = true;
            } else if ((array[i][4]).equals("Recent")) {
                isHighest = false;
            }
            addCourse(array[i][0], Integer.parseInt(array[i][1]), Integer.parseInt(array[i][2]), array[i][3], isHighest, Integer.parseInt(array[i][5]), array[i][6], array[i][7], array[i][8], array[i][9]);
        }
    }

    public ArrayList getAPcourses() {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).isAP()) {
                apCourses.add(courses.get(i));
            }
        }
        return apCourses;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public String[][] getData() {
        return data;
    }
}


