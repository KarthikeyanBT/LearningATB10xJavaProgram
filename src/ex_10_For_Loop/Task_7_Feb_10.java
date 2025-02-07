package ex_10_For_Loop;

import java.util.Scanner;

public class Task_7_Feb_10 {
    public static void main(String[] args) {
        //check if the number is primer number or not
        //input - int
        //output - String
        //logic (n%2==0)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();

        for(int i =2; i<num; i++)
        {
            if(num%2==0)
            {
                System.out.println("Prime Number");
            }else
            {
                System.out.println(" Not Prime Number");
            }
        }


    }
}
