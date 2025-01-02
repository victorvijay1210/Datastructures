package CoreConcepts.Strings;

public class SubStringExample {
	
	public static boolean isSubString(String s, String sub) {
		
		if(s.contains(sub)){
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubString("Hello World", "Worlds"));

	}

}
