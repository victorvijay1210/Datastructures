package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
    	
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestSequence = 0;
        
        for (int num : nums) {
            if (!set.contains(num - 1)) { // check if the current number is the start of a sequence
                int currentNum = num;
                int currentSequence = 1;
                
                // increment currentNum to find the consecutive elements in the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
                
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        
        return longestSequence;
    }
    
    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + solution.longestConsecutive(nums));
    }
}
