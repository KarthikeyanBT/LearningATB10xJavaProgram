package ex_09_Switch;

import java.util.Scanner;

public class Lab099_Assignment {
    public static void main(String[] args) {

    //Please do this assignment program for us
        //CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name:");
        String Name = sc.nextLine();

        System.out.println("Enter the Age:");
        int Age = sc.nextInt();

        System.out.println("Enter the Salary:");
        double Salary = sc.nextDouble();

        // Print the collected information

        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);

        // Close the scanner
        sc.close();


    }
}
