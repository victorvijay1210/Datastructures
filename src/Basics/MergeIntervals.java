package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Merge intervals
        for (int[] interval : intervals) {
            // If result is empty OR no overlap, add the interval
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Overlapping: merge intervals by updating the end time
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: Convert list to 2D array
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);

        // Print merged intervals
        for (int[] arr : merged) {
            System.out.println(Arrays.toString(arr));
        }
    }
}