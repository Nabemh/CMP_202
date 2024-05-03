package Introduction;

public class CMP202_1 {

    int age;
    float height;
    //both int and float are considered as primitive types in java
    String name;
    String password;
    // String how ever is an object type

    void printUserDetails() {
        age = 23;
        height = 170;
        name = "james";
        name.length();

        password = "123456";
        if (password.contains("123456") || password.contains("abcdef"))
            System.out.println("Your password is too easy");
        
    }
    
}
