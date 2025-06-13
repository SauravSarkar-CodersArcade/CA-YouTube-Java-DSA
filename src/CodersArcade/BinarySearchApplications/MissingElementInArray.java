package CodersArcade.BinarySearchApplications;
public class MissingElementInArray {
    public static int findMissingElement(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2; // This is the optimal formula for mid
            if(arr[mid] != mid + 1){
                // left side
                if(mid == 0 || arr[mid-1] == mid){
                    return mid+1;
                }
                e = mid - 1;
            }else {
                // right side
                s = mid + 1;
            }
        }
        return arr.length + 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7};
        System.out.println("Missing Element is: " + findMissingElement(arr1));
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println("Missing Element is: " + findMissingElement(arr2));
    }
}
