package ex_06_Ternary_Operator;

public class Challange {
    public static void main(String[] args) {
       int marks  = 66;
        String grade = ((marks >=90)? "Grade A":((marks>=80)? "Grade B": (marks>=70)? "Grade C": (marks>=60)? "Grade D": "F"));
        System.out.println(grade);
    }
}
