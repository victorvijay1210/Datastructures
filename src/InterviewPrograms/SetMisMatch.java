package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {

	public static int[] missingandDuplicate(int[] nums) {
		
		
		Set<Integer> duplicateentry = new HashSet<Integer>();
		
		int missing = 0;
		int duplicate = 0;
		
		for(Integer num: nums) {
			
			if(duplicateentry.contains(num)) {
				duplicate=num;
			}
			
			duplicateentry.add(num);
		}
		
		
		
		for(int i=1;i<=nums.length;i++) {
			
			if(!duplicateentry.contains(i)) {
				missing=i;
				break;
			}
		}

		return new int[] {duplicate,missing};
		
	}
	
	
	public static void main(String[] args) {
		
		int[] num1= {1,2,2,4};
		
		int[] num2= {1,1};
		
		System.out.println(Arrays.toString(missingandDuplicate(num1)));
		System.out.println(Arrays.toString(missingandDuplicate(num2)));
	}
}

