package ex_16_Arrays;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        int[] marks ={11,22,13,24,5};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for(int i =0 ; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);

    }
}
