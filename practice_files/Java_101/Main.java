package practice_files.Java_101;

import java.util.Scanner;
/*
 * Description: Printing input entered by the user in a java program
 * 
 */


 class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter your name and age: ");
        String myName = input1.nextLine();
        int myAge = input2.nextInt();

        System.out.printf("Your name is %s and you are %d years old.\n", myName, myAge);

    }
 }