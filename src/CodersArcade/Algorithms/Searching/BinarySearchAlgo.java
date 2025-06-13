package CodersArcade.Algorithms.Searching;
public class BinarySearchAlgo {
    static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s)/2;
        while (s <= e){
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] < key) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,11,13,15};
        int index1 = binarySearch(arr, 13);
        int index2 = binarySearch(arr, 5);
        int index3 = binarySearch(arr, 50);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
    }
}
