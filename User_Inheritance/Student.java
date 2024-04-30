package User_Inheritance;

public class Student extends User {
    String matric_no;
    int admission_no;

    String ResisteredCourses() {
        return "Course registration complete";
    }

    String CheckResult() {
        return "Results not yet uploaded";
    }
    
}
