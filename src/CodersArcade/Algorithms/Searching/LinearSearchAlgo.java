package CodersArcade.Algorithms.Searching;
public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,5,9,7};
        int index = linearSearch(arr, 91);
        System.out.println("Key found at index: " + index);
    }
    static int linearSearch(int[] arr, int key){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }return -1;
    }
}
