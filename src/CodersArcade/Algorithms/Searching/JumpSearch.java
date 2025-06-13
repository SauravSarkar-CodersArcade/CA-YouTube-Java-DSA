package CodersArcade.Algorithms.Searching;
public class JumpSearch {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n)); // Step size (block size)
        int prev = 0;

        // Jump in blocks until we find a block where x could be
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // x not found
            }
        }

        // Do a linear search in the block where x may be
        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1; // x not found
            }
        }

        // If we found x
        if (arr[prev] == x) {
            return prev;
        }

        return -1; // x not found
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        int index = jumpSearch(arr, x);

        if (index != -1)
            System.out.println("Number " + x + " is at index " + index);
        else
            System.out.println("Number " + x + " not found in the array");
    }
}
