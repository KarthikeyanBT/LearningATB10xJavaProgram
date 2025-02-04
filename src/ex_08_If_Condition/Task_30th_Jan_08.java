package ex_08_If_Condition;

import java.util.Scanner;

public class Task_30th_Jan_08 {
    public static void main(String[] args) {
        //Find the smallest of three number
        // input - int N1,N2,N3
        // ouput - String
        // login if(N1<1N2 &&N1<N2)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N1 number: ");
        int N1= sc.nextInt();
        System.out.println("Enter the N2 number: ");
        int N2= sc.nextInt();
        System.out.println("Enter the N3 number: ");
        int N3= sc.nextInt();

        if(N1<N2 && N1<N3)
        {
            System.out.println("N1 is the lesser number");
        } else if (N2<N1 && N2<N3) {
            System.out.println("N2 is the lesser number");

        }else {
            System.out.println("N3 is the lesser number");
        }

    }

}
