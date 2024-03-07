package Array;

public class LongestString {
	
	
	public static String findLongestString(String[] strings) {
		String longeststring = "";
		
		for(String str:strings) {
			
			if(str.length()>longeststring.length()) {
				longeststring=str;
			}
		}
		
		return longeststring;
		
	}
	
	

	public static void main(String[] args) {
		
		String[] string = {"apple", "banana", "kiwi", "pear"};
		String longeststringvalue = findLongestString(string);
       System.out.println("The longest String is"+ " "+ longeststringvalue);
       
       String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
       String longest1 = findLongestString(stringList1);
       System.out.println("Test case 1: Longest string: " + longest1);  // prints "banana"
       
       String[] stringList2 = {"cat", "giraffe", "elephant", "hippopotamus"};
       String longest2 = findLongestString(stringList2);
       System.out.println("Test case 2: Longest string: " + longest2);  // prints "hippopotamus"

       String[] stringList3 = {"sun", "moon", "planet", "universe"};
       String longest3 = findLongestString(stringList3);
       System.out.println("Test case 3: Longest string: " + longest3);  // prints "universe"
       
       String[] stringList4 = {"java", "python", "javascript", "c"};
       String longest4 = findLongestString(stringList4);
       System.out.println("Test case 4: Longest string: " + longest4);  // prints "javascript"

       String[] stringList5 = {"", "a", "aa", "aaa"};
       String longest5 = findLongestString(stringList5);
       System.out.println("Test case 5: Longest string: " + longest5);  // prints "aaa"
	}

}
