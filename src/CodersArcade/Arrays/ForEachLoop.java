package CodersArcade.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        char[][] arr = {{'s','a','u','r','a','v'},
                        {'c','o','d','e','r','s'},
                        {'a','r','c','a','d','e'},
                        {'s','u','b','s','c','r','i','b','e'}};
        for (char[] chars : arr){
            for (char ch : chars){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}
