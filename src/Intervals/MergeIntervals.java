package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	
	//Merge Overlapping Intervals
	//Time Complexity:O(n log n)
	//Space Complexity:O(n)
	public static int[][]mergeIntervals(int[][] intervals){
		
		if(intervals.length==1) {
			return intervals;
		}
		
		Arrays.sort(intervals,(a, b)->Integer.compare(a[0], b[0]));
		
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        
        for(int[] interval:intervals) {
        	
        	if(interval[0]<=newInterval[1]) {
        		
        		newInterval[1]= Math.max(newInterval[1], interval[1]);
        	}
        	else {
        		newInterval=interval;
        		result.add(newInterval);
        	}
        	
        	
        }
        
		
		
		return result.toArray(new int[result.size()][]);
		
	}
 
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
		//Input: intervals = [[1,4],[4,5]]
		
		int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals2 = {{1,4},{4,5}};
		 
	   int[] [] merged1=	mergeIntervals(intervals1);
	   int[] [] merged2=	mergeIntervals(intervals2);
	   
	   for(int[] merge:merged1) {
		   
		   System.out.println(Arrays.toString(merge));
	   }
	   
      for(int[] merge:merged2) {
		   
		   System.out.println(Arrays.toString(merge));
	   }
		
	}
	}
	
	


