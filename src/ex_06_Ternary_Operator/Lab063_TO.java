package ex_06_Ternary_Operator;

public class Lab063_TO {

    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;

        int num = -5;
        String result = num>0 ? "Positive": "Negative";
        System.out.println(result);
    }
}
