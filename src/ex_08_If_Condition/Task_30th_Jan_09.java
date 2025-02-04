package ex_08_If_Condition;

import java.util.Scanner;

public class Task_30th_Jan_09 {
    public static void main(String[] args) {
        //check if the year is leap year
        //input - year
        //output - string - cheking leap year or not
        //logic - if(year%4) leap year else not leap year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("Its a Leap year");

        }else {
            System.out.println("Its Not aLeap year");
        }

    }

}
