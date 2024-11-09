package Arrays;

    /**
    * this is a Binary Search algorithm, it searches through an array
    * and returns the index of the value it searches for
    * @author HAMDAOUI Slimane
    * @version 1.0
    * @since 2024-11-09
    */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        System.out.println("the index is: " + search(arr, 9));
    }

    /* first of all the array should be sorted. if its not the binary search method will not work.
     * the method search always for the median value in the array and compare it with value
     * that we are looking for. if the value small we take the left part of array as new subarry and repeat
     * the work. and the same in the opposite case.
     */
    static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length-1;
        int mid;

        while (left <= right) {
            mid = (left + right)/2;
            if (arr[mid] == x) {
                return mid;
            }else if(arr[mid]<x){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        return -1;
    }
}
