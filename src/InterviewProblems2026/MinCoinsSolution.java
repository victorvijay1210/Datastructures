package InterviewProblems2026;

import java.util.*;

//minimum notes problem
//Similar to https://leetcode.com/problems/coin-change/description/?utm_source=chatgpt.com
//Similar to https://www.geeksforgeeks.org/dsa/greedy-algorithm-to-find-minimum-number-of-coins/

public class MinCoinsSolution {

    // Method to calculate breakdown of coins
    public static Map<Integer, Integer> getMinCoins(int amount, int[] denominations) {

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int coin : denominations) {
            if (amount >= coin) {
                int count = amount / coin;   // number of coins
                amount = amount % coin;      // remaining amount
                result.put(coin, count);
            }
        }

        return result;
    }

    // Method to calculate total count
    public static int getTotalCount(Map<Integer, Integer> map) {
        int total = 0;
        for (int count : map.values()) {
            total += count;
        }
        return total;
    }

    public static void main(String[] args) {

        int amount = 1428;
        int[] denominations = {500, 200, 100, 50, 20, 5, 2, 1};

        Map<Integer, Integer> result = getMinCoins(amount, denominations);

        // Print breakdown
        System.out.println("Denomination Breakdown:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("₹" + entry.getKey() + " -> " + entry.getValue());
        }

        // Print total
        int total = getTotalCount(result);
        System.out.println("Total coins/notes used: " + total);
    }
}