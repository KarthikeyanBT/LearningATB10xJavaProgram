package ex_08_If_Condition;

import java.util.Scanner;

public class Task_29th_Jan_05 {
    public static void main(String[] args) {
   //check if the person is eligible to vote
        // input - int age
        // ouput - String
        // login if(age>18) person is eligible to vote else  not eligible

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println(age+ "Eligible to Vote");
        }else
        {
            System.out.println(age+ "Not Eligible to Vote");
        }

    }
}
