package CodersArcade;
import java.util.Arrays;
public class QuickSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        // Place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr,pivotIndex,s);
        // Let's manage the left & right parts of the pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr,i,j);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base Case
        if(s >= e){
            return;
        }
        // Find the pivot for the partition
        int p = partitionIndex(arr,s,e);
        // Now use recursion to sort the two halves
        // Left part
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args) {
        int[] arr = {5,2,0,1,6,9};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
