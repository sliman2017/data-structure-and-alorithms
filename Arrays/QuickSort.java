package Arrays;

import java.util.Random;

    /**
    * This class show us how can we use quick sort algorithm to sort an array
    * from the lowest value to the highest value.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        quickSort.printArray(numbers);
        quickSort.sort(numbers, 0, numbers.length - 1);

        System.out.println("");
        System.out.println("After:  ");
        quickSort.printArray(numbers);
    }
    
    public void printArray(int[] array){
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
    

    public void sort(int[] array, int lowIndex, int highIndex){

        if (lowIndex>= highIndex) {
            return;
        }
        if (lowIndex<=highIndex) {
            int leftPointer = partition(array, lowIndex, highIndex);
            sort(array, lowIndex, leftPointer - 1);
            sort(array, leftPointer + 1, highIndex);
        }

    }
    public int partition(int[] array, int lowIndex, int highIndex){
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer]<=pivot && leftPointer<rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer]>pivot && leftPointer<rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    public void swap(int[] array, int leftPointer, int rightPointer){
        int aux;
        aux = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = aux; 
    }

}
