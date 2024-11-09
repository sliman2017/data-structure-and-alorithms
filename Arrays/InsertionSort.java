package Arrays;
/**
    * This class show us how can we use insertion sort algorithm to sort an array
    * from the lowest value to the highest value.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class InsertionSort {
    public static void main(String[] args) {
        int[] T = {5,3,6,2};

        int n = T.length;
        for (int i = 1; i < n; i++) {
            int aux;
            int j = i;
            // this loop will swap the value of with the index i+1 if its smaller than the the value of i
            while (j > 0 && T[j] < T[j-1]) {
            	aux = T[j-1];
                T[j-1]=  T[j];
                T[j]= aux;
                j--;
            }
        }

        System.out.print("Sorted array: ");
        for (int value : T) {
            System.out.print(value + " ");
        }
    }
}
