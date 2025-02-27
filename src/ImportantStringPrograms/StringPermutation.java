package ImportantStringPrograms;

public class StringPermutation {
	
//	Time Complexity: O(n!)
//	Space Complexity O(n! * n) if all permutations are stored
	
	//swap to generate permutations
	public static void swap(char[] arr, int index1,int index2) {
		
     char temp = arr[index1];
     
     arr[index1]=arr[index2];
     
     arr[index2]= temp;	
	}
	
	public static void solve(char[]arr, int index) {
	
		if(index==arr.length-1) {// Base condition for recursion
			System.out.println(String.valueOf(arr));
		}
		
      for(int i =index; i<arr.length;i++) {
    	  
    	  swap(arr, index, i);
    	  solve(arr, index+1);
    	  swap(arr, index, i);//Backtracking and reverting back all arr to original places
      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC"; // The Permutations and Combination of the given string can be calculated
		                    //By factorial of length of the string which is 3! = 3*2*1
		 if (str.length() == 0 || str == null) {
		      return;
		    }        
       solve(str.toCharArray(), 0);
	}

}
