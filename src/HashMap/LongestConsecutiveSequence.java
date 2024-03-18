package HashMap;

import java.util.HashSet;
import java.util.Set;


public class LongestConsecutiveSequence {
	
	
	
	public static int longestConsecutive(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(Integer num:nums) {
			set.add(num);
			}
		
		int maxlen=0;
		
		for(Integer num:nums) {                      
			 
				
			if(!set.contains(num-1)) {
				
				int currentnumber=num;		
				int currentsequencelen=1;
				
				
				while(set.contains(currentnumber+1)) {
					currentnumber++;
					currentsequencelen++;
				}
				
				maxlen=Math.max(maxlen, currentsequencelen);
				
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
