package ex_18_OOPs_Constructors;

import java.util.Scanner;

public class practice_byk {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the byk name");
String bykname = sc.next();

byk b1 = new byk("clutchone","gearone");
        System.out.println(b1.Clutch);
        System.out.println(b1.gear);
    }
}
