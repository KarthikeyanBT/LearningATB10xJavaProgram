package ex_10_For_Loop;

import java.util.Scanner;

public class Task_7_Feb_08 {
    public static void main(String[] args) {
        //mulitiplication table of a Given number
        // input in int taken from scanner
        // use forloop for multiplication
        // output in int 5*1=5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();

        for (int i=0; i<=10; i++)
        {
            System.out.println(num + "x" + i + "=" +(num*i));
        }


    }
}
