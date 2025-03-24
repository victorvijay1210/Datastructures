package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
	
	//Insert Interval
	//space complexity is O(N)
	//Time Complexity is O(N)
	public static int[][] insertInterval(int[][] intervals, int[]newInterval){
		
		int current=0;
		
		List<int[]> result = new ArrayList<>();
		
		while(current<intervals.length && intervals[current][1] <newInterval[0]) {
			
			result.add(intervals[current]);
			current ++;
		}
		
		//Merging process
		// Merging process (fix: check if intervals overlap)
        while (current < intervals.length && intervals[current][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[current][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[current][1], newInterval[1]);
            current++;
        }

        
        
		result.add(newInterval);
		
		//add remaining	
		while(current<intervals.length) {
			result.add(intervals[current]);
			current++;
		}
		
		return result.toArray(new int[result.size()][]);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
	//	intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
		
		int[][]intervals1 = {{1,3},{6,9}};
		int[]newInterval1= {2,5};
		
		int[][]intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[]newInterval2= {4,8};
		
		int[][] result1=insertInterval(intervals1, newInterval1);
		int[][] result2=insertInterval(intervals2, newInterval2);
		
		for(int[] result: result1) {
			System.out.println(Arrays.toString(result));
		}
		
		for(int[] result: result2) {
			System.out.println(Arrays.toString(result));
		}
		
		
	}

}
