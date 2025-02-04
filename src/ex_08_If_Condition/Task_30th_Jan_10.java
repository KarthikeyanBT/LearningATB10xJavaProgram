package ex_08_If_Condition;

import java.util.Scanner;

public class Task_30th_Jan_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark: ");
        int Mark = sc.nextInt();

        if(Mark>=90 && Mark<=100)
        {
            System.out.println("Grade A+ ");
        } else if (Mark>=80 && Mark<=89) {
            System.out.println("Grade A ");
        }
        else if (Mark>=70 && Mark<=79) {
            System.out.println("Grade B ");
        }
        else if (Mark>=60 && Mark<=69) {
            System.out.println("Grade C ");
        }else {
            System.out.println("Grade D ");

        }
    }
}
