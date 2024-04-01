package dev.suhjae.elgibility.CourseManager;

public class Course {
    private String courseName;
    private int courseId;
    private int minGradeLevel;
    private String referencedTest;
    private boolean isHighest;
    private int minPredictorScore;
    private boolean isAP;

    private String preReqOne;
    private String preReqTwo;
    private String preReqThree;
    private String preReqFour;

    // AP Classes
    Course(String courseName, int courseId, int minGradeLevel, String referencedTest, boolean isHighest, int minPredictorScore, String preReqOne, String preReqTwo, String preReqThree, String preReqFour) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.minGradeLevel = minGradeLevel;
        this.referencedTest = referencedTest;
        this.isHighest = isHighest;
        this.minPredictorScore = minPredictorScore;
        this.isAP = true;
        this.preReqOne = preReqOne;
        this.preReqTwo = preReqTwo;
        this.preReqThree = preReqThree;
        this.preReqFour = preReqFour;

        if (referencedTest == "") {
            this.isAP = false;
        }

    }

    // Non-AP Classes
    Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.isAP = false;
    }

    //getMinGpaCutOff double (0~4)
    //Will return the minimum GPA from this course to be counted as an valid pre-requisite for an AP course.
//
//   HashMap<Integer, Double> orPreReq = new HashMap<Integer, Double>();
//    for(int i = 0; i < preReqOne.length; i++) {
//        if(preReqOne.charAt(i) == ' ' || i == preReqOne.length() - 1) {
//            orPreReq.put(Integer.parseInt(preReqOne.substring(i - 10, i - 5)), Double.parseDouble(preReqOne.substring(i - 6, i))); // key == course, value == gpa
//        }
//    }
//    HashMap<Integer, Double> andPreReq = new HashMap<Integer, Double>();
//    if(preReqTwo.equals(null)) {
//        andPreReq.put(Integer.parseInt(preReqTwo.substring(0, 5)),Double.parseDouble(preReqTwo.substring(6)));
//    }
//    if(preReqThree.equals(null)) {
//        andPreReq.put(Integer.parseInt(preReqThree.substring(0, 5)),Double.parseDouble(preReqThree.substring(6)));
//    }
//    if(preReqFour.equals(null)) {
//        andPreReq.put(Integer.parseInt(preReqFour.substring(0, 5)),Double.parseDouble(preReqFour.substring(6)));
//    }


//    Map<String, Double> productsByName = new HashMap<>();
//    public HashMap getPreReq(preReqOne, preReqTwo, preReqThree, preReqFour){
//        int n = 0;
//
//        if (preReqOne == null){
//            n += 1;
//        }
//
//        if (pre)
//    }


    public int getCourseID() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinGradeLevel() {
        return minGradeLevel;
    }

    public boolean isAP() {
        return this.isAP;
    }

    //getSatMinMathScore int
    //Will return the minimum SAT Math score required to take the course. -1 if there is no requirement.
    public int getSatMinMathScore() {
        if (referencedTest.equals("Math")) {
            return minPredictorScore;
        }
        return -1;
    }

    //getSatMinEBRW int
    //Will return the minimum SAT EBRW score required to take the course. -1 if there is no requirement.
    public int getSatMinEBRW() {
        if (referencedTest.equals("EBRW")) {
            return minPredictorScore;
        }
        return -1;
    }

    //getMinSatCutOff int
    //Will return the minimum SAT Total score required to take the course. -1 if there is no requirement.
    public int getMinSatCutOff() {
        if (referencedTest.equals("Total")) { // check later
            return minPredictorScore;
        }
        return -1;
    }

    //satReferenceBest boolean
    //True: Look for the best SAT score in the student's record
    //False: Look for the latest SAT score in the student's record
    public boolean satReferenceBest() {
        return isHighest;
    }


}


