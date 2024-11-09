package Arrays;
public class SelectionSort {

    /**
    * This class show us how can we use Selection sort algorithm to sort an array
    * from the lowest value to the highest value.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] myarray2 = { 10, 3 };
        int[] myarray3 = { 8, 1, 3 };
        int[] myarray4 = { 10, 5, 2, 7};
        selectionSort.printSort(myarray2, myarray3, myarray4);
    }


    /**
     * This method calls the selection sort method and print the result in four tested cases.
     */
    public void printSort(int[] marray2, int[] marray3, int[] marray4) {
        marray2 = sort(marray2);
        System.out.print("\nTest Case 02: ");
        for (int i : marray2) {
            System.out.print("   " + i);
        }
        System.out.print("\nTest Case 03: ");
        marray3 = sort(marray3);
        for (int i : marray3) {
            System.out.print("   " + i);
        }
        System.out.print("\nTest Case 04: ");
        marray4 = sort(marray4);
        for (int i : marray4) {
            System.out.print("   " + i);
        }
    }

    
    /**
    * this is the selection sort method
    */
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            // here we will find the index of smallest value and 
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            // the next three lines of code will swap the value of the min_index with the value in of i index
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }

        return array;
    }
}
