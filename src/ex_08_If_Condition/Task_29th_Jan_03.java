package ex_08_If_Condition;

import java.util.Scanner;

public class Task_29th_Jan_03 {
    public static void main(String[] args) {

        //find the maximum of two number
        //input = n1 and n2
        //output = String, n1 is maximum number
        //Logic = if(n1<n2) then n2 is maximum number else n1 is maximum  number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1:" );
        int n1 = sc.nextInt();
        System.out.println("Enter the number n2:" );
        int n2 = sc.nextInt();

        if(n1<n2)
        {
            System.out.println("N2 is the Maximum number" );
        }else
        {
            System.out.println("N1 is the Maximum number" );
        }

    }
}
