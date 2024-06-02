package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashSet;

public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}

