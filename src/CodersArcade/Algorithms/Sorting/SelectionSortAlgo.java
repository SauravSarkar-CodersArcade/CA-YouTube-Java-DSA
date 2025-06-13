package CodersArcade.Algorithms.Sorting;
import java.util.Arrays;
public class SelectionSortAlgo {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,8,1,6,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
