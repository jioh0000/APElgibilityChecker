package dev.suhjae.elgibility.EligibilityManager;

import dev.suhjae.elgibility.CourseManager.CourseManager;
import dev.suhjae.elgibility.StudentManager.StudentManager;

public class EligibilityManager {
    CourseManager courseManager;
    StudentManager studentManager;

    EligibilityManager(CourseManager cm, StudentManager sm) {
        this.courseManager = cm;
        this.studentManager = sm;
    }

    //Method that runs automatically
    public String[][] Go() {
        return some2Darray;
    }


}

