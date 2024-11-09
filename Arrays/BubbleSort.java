package Arrays;

/**
    * This class show us how can we use bubble sort algorithm to sort an array
    * from the lowest value to the highest value.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort BubbleSort = new BubbleSort();
        int[] myarray = {3};
        int[] myarray2 = {10, 3};
        int[] myarray3 = {8, 1, 3};
        int[] myarray4 = {10, 5, 2, 7, 8, 1, 3};
        BubbleSort.printSort(myarray, myarray2, myarray3, myarray4);        
    }

    /**
     * This method calls the bubble sort method and print the result in four tested cases.
     */
    public void printSort(int[] array, int[] array2, int[] array3, int[] array4){
        array = sort(array); // this is the sort method.
        System.out.print("\nTest Case 01: ");
        for (int i : array) {
            System.out.print("   " + i);
        }
        array2 = sort(array2);
        System.out.print("\nTest Case 02: ");
        for (int i : array2) {
            System.out.print("   " + i);
        }
        System.out.print("\nTest Case 03: ");
        array3 = sort(array3);
        for (int i : array3) {
            System.out.print("   " + i);
        }
        System.out.print("\nTest Case 04: ");
        array4 = sort(array4);
        for (int i : array4) {
            System.out.print("   " + i);
        }
    }
    
    /**
     * this is the bubble sort method
     */
    public int[] sort(int[] tab){
        int temp;
        for (int i = 0; i < tab.length-1; i++) {
            for (int j = 0; j < tab.length-i-1; j++) {
                if (tab[j]>tab[j+1]) {
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        return tab;
    }
}
