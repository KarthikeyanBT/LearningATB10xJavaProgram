package ex_10_For_Loop;

import java.util.Scanner;

public class Task_7_Feb_09 {
    public static void main(String[] args) {
        // write the factorial number
        //input int
        //output int
        // logic 5! 5*4*3*2*1 =120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();
        long factorial =1;
        for(int i=1 ; i<=num; i++)
              {
                 //System.out.println (num + "x" +(num-1)+ "x" + (num-2)+ "x" +(num-3)+ "x" +(num-4)+ "=" +num*(num-1)* (num-2)*(num-3)*(num-4));
             factorial *=i;
             System.out.println("factorial of" + num +  "is" +factorial);
              }
    }
}
