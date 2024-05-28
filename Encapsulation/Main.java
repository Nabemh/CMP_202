package Encapsulation;

public class Main {
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
        // Person student = new Person("Dan", "Bingham", "1234", "bhu/22/04/05/0054", 123);
        Person staff = new Person("Staff Name", "Bingham", "23424", null, 445);
        System.out.println(staff);
        
        // System.out.println(person.getName());
        // System.out.println(person.setPassword("1243533"));;
        // person.password = "12344";
    }
}