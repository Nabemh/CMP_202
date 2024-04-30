package User_Inheritance;

public class Main {
    public static void main(String[] args) {
        
        // User instance 
        User user = new User();
        user.name = "Nathan";
        user.password = "luxury@123";

        System.out.println("User login status: " + user.login());
        System.out.println("Registraion status: " + user.Register());

        // Admin instance
        Admin admin = new Admin();
        admin.name = "User 1";
        admin.password = "adminUser@123";
        admin.staffNo = "ID_001";

        System.out.println("Admin login status: " + admin.login());
        System.out.println("Upload result (Admin): " + admin.uploadResult("CMP 203", (float) 90.2));

        // Student instance
        Student student = new Student();
        student.name = "Nathaniel";
        student.password = "password!";
        student.matric_no = "BHU/19/04/05/0098";
        student.admission_no = 1011238966;

        System.out.println ("Results Status: " + student.CheckResult());
        

    }
    
}
