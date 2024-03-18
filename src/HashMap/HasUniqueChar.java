package HashMap;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChar {
	
	public static Boolean areUniquie(String str) {
		
		Set<Character> unique = new HashSet<>();
		
		for(  char c: str.toCharArray()) {
			
			if(unique.contains(c)) {
				return false;
			}
			
			unique.add(c);
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areUniquie("abcdefg")); // should return true
        System.out.println(areUniquie("hello")); // should return false
        System.out.println(areUniquie("")); // should return true
        System.out.println(areUniquie("0123456789")); // should return true
        System.out.println(areUniquie("abacadaeaf")); // should return false
	}

}
