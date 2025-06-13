package CodersArcade.BinarySearchApplications;
public class SquareRootUsingBinarySearch {
    static int binarySearch(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == mid){
                return mid;
            }
            else if(square > n){
                // Go to the left part
                e = mid - 1;
            } else  {
                ans = mid;
                // Go to the right hand side
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(36));
        System.out.println(binarySearch(37));
    }
}
