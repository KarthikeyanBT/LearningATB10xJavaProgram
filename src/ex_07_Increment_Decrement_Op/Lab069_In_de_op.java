package ex_07_Increment_Decrement_Op;

public class Lab069_In_de_op {
    public static void main(String[] args) {
        String age_string = args[0];
        int age  = Integer.parseInt(age_string);
System.out.println(age);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        //        System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException

        String canIgoGoa = age>24? "Yes": "No";
        System.out.println(canIgoGoa);
    }
}
