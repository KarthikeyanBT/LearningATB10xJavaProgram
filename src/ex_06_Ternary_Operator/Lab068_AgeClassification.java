package ex_06_Ternary_Operator;

public class Lab068_AgeClassification {
    public static void main(String[] args) {
        //int age = 17;

        String age_string = args[0];
        int age = Integer.parseInt(age_string);

        String result = (age<18) ? "Minor": (age>65) ? "Adult" : "senior" ;

        System.out.println(result);

    }
}
