package Intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
	
	//https://leetcode.com/problems/non-overlapping-intervals/description/
	//https://www.youtube.com/watch?v=gXC3t31HT3o

	//Time Complexity:O(n log n)
	//Space Complexity:O(n)
	
	public static int nonOverlappingIntervalCount(int[][] intervals) {
		
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));		
		
	int toRemove=0;
	
	
	for(int i=0;i<intervals.length;i++) {
		
		int current = intervals[i][1];
		
		while(i+1 <intervals.length && current>intervals[i+1][0]) {
			
			toRemove=toRemove+1;
			current= Math.min(current, intervals[i+1][1]);
			i++;
			
		}
		
	}
		
		
		return toRemove;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(nonOverlappingIntervalCount(intervals));
	}

}
