package ex_16_Arrays;

public class Lab146 {
    public static void main(String[] args) {
        String[] name = {"karthik","Lenga","Vijay"};
        System.out.println(name.length);
        System.out.println(name[2]);

        String[] name_10x = new String[3];
        name_10x[0] ="karthik";
        name_10x[1] = "Lenga";
        name_10x[2] ="Vijay";
        System.out.println(name_10x[0]);

        boolean[] is_Data = new boolean[2];
        is_Data[0]= true;
        is_Data[1]= false;

        System.out.println(is_Data[0]);


    }
}
