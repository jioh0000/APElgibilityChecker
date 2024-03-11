### Eligibility Manager

With access to public methods from the two other managers, it creates eligibility records for each student and formats
it into a 2D array capable of being displayed.

---

## Method We need

### Student

This class is the student class that includes the information of single student.

- **getStudentID** `String`
    - This method will return the student ID
- **getCurrentGradeLevel** `int`
    - This method will return the current grade level of the student (between 9~12)
- Get GPA
- **getApPredictedScore** `int`
    - This method will return collageboard AP predicted score of the student
- **getEnrolledCourses** `ArrayList<CourseRecord>`
    - This method will return the list of courses that the student is enrolled in.
- **getMaxSatTotal** `int`
    - This method will return the maximum SAT/PSAT total score of the student
- **getMaxSatEBRW** `int`
    - This method will return the maximum SAT/PSAT EBRW score of the student
    - EBRW: Evidence-Based Reading and Writing
- **getMaxSatMath** `int`
    - This method will return the maximum SAT/PSAT Math score of the student
- **GetGPA** `double`
    - This method will return the GPA of the student

### CourseRecord

This class is the course record class that includes the information of single course record.

- getCourse `Course`
    - Will return the reference to the course Class that contains futher information about the course.
- getEnrolledGradeLevel `int` (9~12)
    - Will return the grade level that the student took this course in
- getGradePercent `int` (0~100)
    - Will return the grade value that the student got in this course

### Course

This class describes the course in the school.

- getCourseID `String`
    - Will return the course ID
- getMinGradeLevel `int` (9~12)
    - Will return the minimum grade level required to take the course.
