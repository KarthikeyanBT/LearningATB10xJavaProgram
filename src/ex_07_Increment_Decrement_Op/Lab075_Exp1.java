package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //A+B
        //a++ -->10
        //+
        //++a -->1+11
        //A+B = 10+12 =22
    }
}
