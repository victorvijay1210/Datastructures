package SortingAlgorithm;

//Kth Largest Element in an Array (Heap problem leetcode)
public class FindKLargestElement {
	
    // Swap helper function
    public static void swap(int[] array, int i, int j) {		
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;	
    }

    // Partition function
    public static int pivotIndex(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;	
		for(int i=pivotIndex+1;i<array.length;i++) {
			
			if(array[i]<array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
			
		}
		
		swap(array, pivotIndex, swapIndex);				
		return swapIndex;		
	}

    // QuickSort function
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = pivotIndex(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex - 1); // Left side
            quickSort(array, pivotIndex + 1, endIndex); // Right side
        }
    }

    // Function to find the k-th largest element
    public static int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k]; // Return k-th largest element
    }

    // Main function
    public static void main(String[] args) {
        int[] unSortedArray = {3, 2, 1, 5, 6, 4};	
        int k = 2;

        int result = findKthLargest(unSortedArray, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
