package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutationGenerator {
	
	
	public static void swap(char[] chr, int start, int end) {	
		char temp = chr[start];
		chr[start]=chr[end];
		chr[end]=temp;	
	}
	
	
	public static void solve(char[] ch, int index , Set<List<Character>> result) {
		
		if(index==ch.length-1) {
			
			List<Character> permutation= new ArrayList<>();
			
			for(char c: ch) {
				
				permutation.add(c);
			}
			result.add(permutation);
			
		}
		
		
		for(int i=index;i<ch.length;i++) {
			
			swap(ch, index, i);
			solve(ch, index+1, result);
			swap(ch, index, i);
		}
	}
	
	public static Set<List<Character>> generateCharPermutation(char[] chr){
		
		Set<List<Character>> result =new  HashSet<>();
		solve(chr, 0, result);
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s = {'A','A','C'};
		
		Set<List<Character>> permutations=  generateCharPermutation(s);
		
		for(List<Character> prems: permutations) {
			System.out.println(prems);
		}

	}

}
