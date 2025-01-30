package ex_08_If_Condition;

import java.util.Scanner;

public class Task_29th_Jan_04 {
    public static void main(String[] args) {
        //check if a character is vowel(a,e,i,o,u)  of Consonant(b,cd,f,g,h,j,k,l,m,n,p,q,rs,t,v,w,x,y,z)
        // input - char[] a ={'A','E','I','O','U'}, char[] b = {'B','C','D','F','H','I','J','K','L','M','N','P','Q','R','S','T','V','W','X,'Y','Z'}
        //output - vowel/consonant
        //Logic  if

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch  =sc.next().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+ "is a vowel");
        }else if(ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
        {
            System.out.println(ch + "is a Consonant");
        }else
        {
            System.out.println(ch + "is number/symbols");
        }



    }
}
