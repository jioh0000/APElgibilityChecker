package dev.suhjae.elgibility.model;

public class Course {
    private String courseID;
    private String CourseName;
    private int minGradeLevel;
    private boolean isAP;
    private double minGpaCutOff;
    private int satMinMathScore;
    private int satMinEBRW;
    private int minSatCutOff;
    private boolean satReferenceBest;

    public Course(String courseID, String CourseName, int minGradeLevel, boolean isAP, double minGpaCutOff, int satMinMathScore, int satMinEBRW, int minSatCutOff, boolean satReferenceBest) {
        this.courseID = courseID;
        this.CourseName = CourseName;
        this.minGradeLevel = minGradeLevel;
        this.isAP = isAP;
        this.minGpaCutOff = minGpaCutOff;
        this.satMinMathScore = satMinMathScore;
        this.satMinEBRW = satMinEBRW;
        this.minSatCutOff = minSatCutOff;
        this.satReferenceBest = satReferenceBest;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getMinGradeLevel() {
        return minGradeLevel;
    }

    public boolean isAP() {
        return isAP;
    }

    public double getMinGpaCutOff() {
        return minGpaCutOff;
    }

    public int getSatMinMathScore() {
        return satMinMathScore;
    }

    public int getSatMinEBRW() {
        return satMinEBRW;
    }

    public int getMinSatCutOff() {
        return minSatCutOff;
    }

    public boolean satReferenceBest() {
        return satReferenceBest;
    }
}
