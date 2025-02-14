package ex_16_Arrays;

public class sort_the_array {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        //input - 12, 34, 10, 1, 100, 3, 4, 32
        //output - 1,3,4,10,12,32,34,100
        // Selection Sort Logic

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) { // Find the smallest element
                    minIndex = j;
                }
            }
            // Swap the smallest element with the current position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
