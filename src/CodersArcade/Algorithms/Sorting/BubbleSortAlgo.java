package CodersArcade.Algorithms.Sorting;
import java.util.Arrays;
public class BubbleSortAlgo {
    static void bubbleSort(int[] arr){
        // No of iterations
        int n = arr.length;
        for (int i=0; i< n-1; i++){
            for (int j=0; j < n - i - 1; j++){ // Comparisons
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,0,7,6,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
