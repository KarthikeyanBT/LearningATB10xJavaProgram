package ex_08_If_Condition;

import java.util.Scanner;

public class Task_29th_Jan_01 {
    public static void main(String[] args) {
        //Check if a number is Postive or Negative
        // input - int
        //output - string
        //logic - if(n<0) is negative else positive
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
              int n = sc.nextInt();

        if(n<0)
        {
            System.out.println("Negative");
        }else
        {
            System.out.println("Postive");
        }
    }
}
