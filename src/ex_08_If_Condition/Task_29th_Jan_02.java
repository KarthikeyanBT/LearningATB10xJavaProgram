package ex_08_If_Condition;

import java.util.Scanner;

public class Task_29th_Jan_02 {
    public static void main(String[] args) {
        //Check the number is even or odd
        //input - int
        //output - String
        //logic - if(n%2=0) is event else odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }
        sc.close();
    }
}
