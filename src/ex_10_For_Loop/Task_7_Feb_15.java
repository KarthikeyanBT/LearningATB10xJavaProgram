package ex_10_For_Loop;

public class Task_7_Feb_15 {
    public static void main(String[] args) {
        // inverted Pyramid patten updated one
        //*******
        // *****
        //  ***
        //  **
        //  *

        for(int i =5; i>=1; i--)
        {
            for(int j=0; j<=i; j++) {
                System.out.print("");
            }
            for(int k=1; (k<=2*i-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
