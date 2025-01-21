package ex_06_Ternary_Operator;

public class Lab062_TO {

    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;

        int age = 10;
        String caniVote = age >=18 ? "yes, you can vote ":"No, you shoud not vote";
        System.out.println(caniVote);
    }

}
