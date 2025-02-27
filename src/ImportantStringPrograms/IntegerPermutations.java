package ImportantStringPrograms;

public class IntegerPermutations {
	
//	Time Complexity: O(n!)
//	Space Complexity O(n! * n) if all permutations are stored
	
	public static void swap(int[] nums, int index1, int index2) {
		
		int temp = nums[index1];	
		nums[index1]=nums[index2];
		nums[index2]=temp;
		
	}
	
	public static void solve(int[] nums,int index) {
		
		if(index==nums.length-1) {//Base condition for recursion 
			printArray(nums);	
		}
		
		for(int i=index;i<nums.length;i++) {
			swap(nums, index, i);
			solve(nums, index+1);
			swap(nums, index, i);//Backtracking reverting back elements to its original position 
		}		
		
	}
	
	public static void printArray(int[] nums) {//print arrays one by one
		
		for(int n:nums) {
            System.out.print(n + " ");

		}
		
		System.out.println("| ");
	}

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3}; // The Permutations and Combination of the given Integer can be calculated
        //By factorial of length of the Integer which is 3! = 3*2*1
		
        if(nums.length==0|| nums==null) {
        	return;
        }
        
      solve(nums, 0);  
		
	}

}
