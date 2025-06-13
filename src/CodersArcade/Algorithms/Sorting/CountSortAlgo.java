package CodersArcade.Algorithms.Sorting;
import java.util.Arrays;
public class CountSortAlgo {
    public static void countSort(int[] arr){
        // Find the max
        int k = arr[0];
        for (int i=1; i<arr.length; i++){
            k = Math.max(k, arr[i]);
        }
        // Create a count array (max+1) (0 to max)
        int[] count = new int[k+1];
        // Calculate the frequency of all the elements
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative count : curr = curr + prev
        for(int i=1; i<= k; i++){
            count[i] += count[i-1];
        }
        // Create the output array
        int[] output = new int[arr.length];
        // start from the end of the array to store the output
        for(int i= arr.length-1; i>= 0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output back to the input
        System.arraycopy(output,0,arr,0, arr.length);

    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        System.out.println("Before: " +Arrays.toString(arr));
        countSort(arr);
        System.out.println("After: " +Arrays.toString(arr));
    }
}
