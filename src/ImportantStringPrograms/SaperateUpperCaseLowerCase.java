package ImportantStringPrograms;


//Java program to gives two Output:
//“abcde”, “ABCDE” for the Input
//String Str = “aBACbcEDed”

public class SaperateUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aBACbcEDed";
		StringBuilder upperCase = new StringBuilder();
		StringBuilder lowerCase = new StringBuilder();
		
       for(char c:str.toCharArray()) {
    	   
    	   if(Character.isLowerCase(c)) {
    		   
    		   lowerCase.append(c);
    	   }
    	   
    	   else if(Character.isUpperCase(c)) {
    		   upperCase.append(c);
    	   }
       }
       
       System.out.println("UpperCase:" + upperCase.toString());
       System.out.println("LowerCase:" + lowerCase.toString());
	}

	
}
