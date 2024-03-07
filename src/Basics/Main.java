package Basics;

import java.util.Arrays;

public class Main {
	
	public static int[] findMaxMin(int[] myList) {
        int maximum = myList[0];
        int minimum = myList[0];
        for (int num : myList) {
            if (num > maximum) {
                maximum = num;
            } else if (num < minimum) {
                minimum = num;
            }
        }
        return new int[] {maximum, minimum};
    }



    public static void main(String[] args) {
        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

        int[] myList2 = {-5, -3, -8, -1, -6, -9};
        int[] result2 = findMaxMin(myList2);
        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

        int[] myList3 = {0, 0, 0, 0, 0};
        int[] result3 = findMaxMin(myList3);
        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

        int[] myList4 = {100, 200, 300, 400, 500};
        int[] result4 = findMaxMin(myList4);
        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"
        
    }

}