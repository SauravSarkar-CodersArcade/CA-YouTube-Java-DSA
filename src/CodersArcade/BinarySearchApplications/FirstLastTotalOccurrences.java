package CodersArcade.BinarySearchApplications;

public class FirstLastTotalOccurrences {
    public static int firstOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the answer & go to the extreme left
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the answer & go to the extreme right
                ans = mid;
                s = mid + 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int totalOccurrence(int[] arr, int key){
        int fo = firstOccurrence(arr,key);
        int lo = lastOccurrence(arr,key);
        int total = lo - fo + 1;
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6};
        int first = firstOccurrence(arr,3);
        int last = lastOccurrence(arr,3);
        int total = totalOccurrence(arr,3);
        System.out.println("First Occurrence of 3 is: " + first);
        System.out.println("Last Occurrence of 3 is: " + last);
        System.out.println("Total Occurrence of 3 is: " + total);
    }
}
