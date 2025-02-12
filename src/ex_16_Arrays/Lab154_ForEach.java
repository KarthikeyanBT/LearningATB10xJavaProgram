package ex_16_Arrays;

public class Lab154_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        String[] names = {"pramod", "amit", "lucky", "anil"};
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

        for(int n: a){
            System.out.println(n);
        }

        for(String karthik: names){
            System.out.println(karthik);
        }

    }

}
