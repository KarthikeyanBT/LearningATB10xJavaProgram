package ex_16_Arrays;

import java.util.Scanner;

public class left_Triangles_pattern {
    public static void main(String[] args) {
        //RightTriangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = scanner.nextInt();

        for (int i =1; i <= n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }}