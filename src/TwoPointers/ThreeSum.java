package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/3sum/description/
//Time Complexity: O(n)^2
//Space Complexity:O(n)
public class ThreeSum {
	
	public static List<List<Integer>> findTriplets(int[] nums){
		
		if(nums.length<3 || nums==null) {
			return new ArrayList<List<Integer>>();
		}
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		
		for(int i=0; i<nums.length-2;i++) {
			
			int left = i+1;
			int right= nums.length-1;
			
			while(left<right) {
				int sum= nums[i]+nums[left]+nums[right];
				
				if(sum==0) {
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
				}
				
				else if(sum<0) {
					left++;
				}
				else {
					right--;
				}
			}
			
		}
		
		return new ArrayList<List<Integer>>(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> datas=	findTriplets(new int[] {-1,0,1,2,-1,-4});
		
		for(List<Integer> data:datas) {
			System.out.println(data);
		}

	}

}
