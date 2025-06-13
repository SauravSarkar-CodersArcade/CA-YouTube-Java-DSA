package CodersArcade.Algorithms.Sorting;
import java.util.Arrays;
public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] a1, int[] a2){
        int n1 = a1.length;
        int n2 = a2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        // This is for the equal sizes
        while (i < n1 && j < n2){
            if(a1[i] < a2[j]){
                merged[k++] = a1[i++];
            }else {
                merged[k++] = a2[j++];
            }
        }
        // Copy remaining part if any from 1st array
        while (i < n1){
            merged[k++] = a1[i++];
        }
        // Copy remaining part if any from 2nd array
        while (j < n2){
            merged[k++] = a2[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6};
        int[] merged = mergeSortedArrays(a1, a2);
        System.out.println(Arrays.toString(merged));
    }
}
