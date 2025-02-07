package ex_10_For_Loop;

import java.util.Scanner;

public class Task_7_Feb_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();
        long fact = 1;
               // input integer
        // output = int
        // logic 5 * 4* 3 *2*1 =120
        // fact = fact * 1 = 1=1*1  i=1
        // fact = fact * 1 = 1=1*2   i=2
        //fact =  fact * 2 = 2 = 2* 3 i=3
        String  number = num + "!  = ";
        System.out.println(number);
        for(int i =1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println(number + fact);



    }
}
