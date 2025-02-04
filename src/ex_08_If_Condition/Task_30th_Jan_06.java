package ex_08_If_Condition;

import java.util.Scanner;

public class Task_30th_Jan_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N1 number: ");
        int N1= sc.nextInt();
        System.out.println("Enter the N2 number: ");
        int N2= sc.nextInt();
        System.out.println("Enter the N3 number: ");
        int N3= sc.nextInt();

        if(N1>N2 && N1>N3)
        {
            System.out.println("N1 is the greater number");
        } else if (N2>N1 && N2>N3) {
            System.out.println("N2 is the greater number");

        }else {
            System.out.println("N3 is the greater number");
        }

    }

}
