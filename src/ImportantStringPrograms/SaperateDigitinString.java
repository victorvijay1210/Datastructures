package ImportantStringPrograms;

//Java program to gives two Output:
//“Subburaj”, “123” for the Input
//String Str = “Subbu123raj”

public class SaperateDigitinString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Subbu123raj";
		
		StringBuilder st = new StringBuilder();
		StringBuilder it = new StringBuilder();
		
		for(char c: str.toCharArray()) {
			
			if(Character.isDigit(c)) {
				
				it.append(c);
			}
			
			else {
				
				st.append(c);
			}
		}

		System.out.println("String value:"+ st.toString());
		System.out.println("Digit value:"+ it.toString());
	}

}
