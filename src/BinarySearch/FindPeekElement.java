package BinarySearch;


//time complexity: O(log N)
//space complexity: O(1)

//https://leetcode.com/problems/find-peak-element/description/
public class FindPeekElement {

	public static int peekElement(int[] array) {
		
		int left = 0;
		int right= array.length-1;
		
		while(left<right) {
			
			int middle = left+(right-left)/2;
			
			if(array[middle]>array[middle+1]) {
				right=middle;
			}
			
			else {
				left=middle+1;
			}	
			
		}
		
		
		return left;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4};
		System.out.println(peekElement(nums));

	}

}
