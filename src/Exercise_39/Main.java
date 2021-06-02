/*
Задание с собеседования
* Missing number
* You are given a array of n-1 integers and these integers are in the range of 0 to n.
* There are no duplicates in array. One of the integers is missing in the array.
Write an efficient code to find the missing integer.
 * Example:
 * I/P [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P 5
*/
package Exercise_39;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 6, 7, 8};
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != i) {
                System.out.print("\nMissing number: " + i);
                break;
            }
       }
    }
}
