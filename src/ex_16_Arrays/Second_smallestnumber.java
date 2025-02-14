package ex_16_Arrays;

import java.util.Arrays;

public class Second_smallestnumber {
    public static void main(String[] args) {
        int[] arr = {12, 36, 10, 1, 100, 3, 4, 32};
for(int i =1 ; i<arr.length-1; i++){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-i]);
    }}
}
