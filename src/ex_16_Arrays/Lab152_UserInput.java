package ex_16_Arrays;

import java.util.Scanner;

public class Lab152_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int size =sc.nextInt();

        //int[] n = new int[size];
        String[] names = new String[size];
        float[] fg = new float[size];
        names[0] ="karthik";
        names[1] ="vijay";
        names[2]="vikram";
        names[3]="jhon";
        names[4]="victor";


//        for(int i=0; i<size; i++)
//        {
//            System.out.println(i);
//        }

        for (int i = 0; i < fg.length; i++) {
            System.out.println("Enter the number");
            fg[i] = sc.nextFloat();
        }


//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
//        }


    }
}
