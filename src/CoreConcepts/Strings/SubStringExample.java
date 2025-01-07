package CoreConcepts.Strings;

public class SubStringExample {
	
	//checks substring is available
	public static boolean isSubString(String s, String sub) {
		
		if(s.contains(sub)){
			return true;
		}
		
		return false;
		
	}
	
	//count the substring occurance
	public static int countOccurance(String s, String sub) {
		
		int count = 0;
		int index =0;
		
		while((index= s.indexOf(sub, index))!=-1) {
			count ++;
			index+=sub.length();
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubString("Hello World", "Worlds"));
        System.out.println(countOccurance("Hello, World! World!", "World"));
	}

}
