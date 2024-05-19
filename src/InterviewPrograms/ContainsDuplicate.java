package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;
//Time Complexity: O(n)
	//Space Complexity: O(n)
public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {

	       Set<Integer> set = new HashSet<>();


	       for(Integer num:nums){
	          
	          if(set.contains(num)){
	            return true;
	          }
	          set.add(num);

	       }



	    return false;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {1,2,3,1};
		System.out.println(containsDuplicate(num));
		
	}

}
