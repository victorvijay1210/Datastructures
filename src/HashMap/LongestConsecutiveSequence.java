package HashMap;

import java.util.HashSet;
import java.util.Set;


public class LongestConsecutiveSequence {
	
	
	
	public static int longestConsecutive(int[] nums) {
		
		 Set<Integer> set = new HashSet<>();
		    for (int num : nums) {
		    	set.add(num);
		    }

		    int maxlen = 0;
		    
		    for (int num : nums) {
		    	
		        if (!set.contains(num - 1)) {
		        	
		            int currentLength = 1;
		            
		            while (set.contains(num + 1)) {
		                num++;
		                currentLength++;
		            }
		            
		            maxlen = Math.max(maxlen, currentLength);
		        }
		    }
		    return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutive(nums));
	}

}
