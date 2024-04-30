package User_Inheritance;

public class Admin extends User {
    String staffNo;
    
    String uploadResult(String course, float score) {
        return (course + " " + score);
    }
    
}
