package CoreConcepts.Strings;

public class BestPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use StringBuilder for Concatenation in Loops
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
		    sb.append(i);
		}
		String result = sb.toString();
		System.out.println(result);
		
		//Use to format the String 
		String name = "John";
		int age = 30;
	   	String formattedString = String.format("Name: %s, Age: %s", name, age);
	   	System.out.println(formattedString);
	}
	
	

}

