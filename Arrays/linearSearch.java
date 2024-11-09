package Arrays;

    /**
    * This class user linearSearch algorithm to search for
    * the index of shosen value in an array.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 2, 6, 7, 1, 3};
        System.out.println("the index is: "+ search(arr, 3));
    }

    static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
