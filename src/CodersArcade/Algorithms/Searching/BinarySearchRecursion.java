package CodersArcade.Algorithms.Searching;
public class BinarySearchRecursion {
    static int recursiveBinarySearch(int[] arr, int s, int e, int key){
        // Base Case
        if (s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == key){
            return mid;
        } else if (arr[mid] < key) {
            return recursiveBinarySearch(arr,mid+1, e, key);
        }else {
            return recursiveBinarySearch(arr,s,mid-1,key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,11,13,15};
        int ind1 = recursiveBinarySearch(arr, 0, arr.length-1, 13);
        int ind2 = recursiveBinarySearch(arr, 0, arr.length-1, 5);
        int ind3 = recursiveBinarySearch(arr,0,arr.length-1,90);
        System.out.println(ind1);
        System.out.println(ind2);
        System.out.println(ind3);
    }
}
