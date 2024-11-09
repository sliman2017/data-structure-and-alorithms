package Arrays;
import java.util.Random;

    /**
    * This class show us how can we use radix sort algorithm to sort an array
    * from the lowest value to the highest value.
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class RadixSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 900);
        }
        radix(numbers);
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

    static void radix(int[] arr) {

        System.out.print("before sort the list:  ");
        for (int val : arr) {
            System.out.print(val+ " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        int max = findMax(arr);
        int numDigits = 1, 
            newMax = max,
            a = 1,
            k = 1, // counter for digit numbers
            m = 0,
            digit, 
            j = 0;
        while (newMax / 10 >= 1) {
            numDigits++;
            newMax = newMax / 10;
        }

        while (k <= numDigits && m < arr.length-1) {
            int[][] count = new int[10][arr.length];
            for (int val : arr) {
                digit = (val / a) % 10;
                if(count[digit][j]!=0){
                    j++;
                }
                count[digit][j] = val;
            }

            int n = arr.length-1;
            for (int i = 9; i >= 0; i--) {
                for (int java = arr.length-1; java >= 0 ; java--) {
                    if (count[i][java] == 0) {
                        continue;
                    }else{
                        arr[n] = count[i][java];
                        n--;
                    }
                }
            }
            j=0;
            k++;
            m++;
            a*=10;
        }
        System.out.print("the sorted list is:  ");
        for (int val : arr) {
            System.out.print(val+ " ");
        }

    }

}
