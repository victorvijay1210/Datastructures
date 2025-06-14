package Basics;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		map.put('A', 1);
		map.put('B', 2);
		
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get('B'));
		

	}

}
