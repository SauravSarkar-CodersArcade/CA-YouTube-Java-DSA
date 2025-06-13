package CodersArcade;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=1; i< arr.length; i++){ // n - 1 iterations
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j]; // Shift operation
                j--;
            }
            arr[j+1] = temp; // Fill the empty space/index with the temporary value
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,0,4,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
