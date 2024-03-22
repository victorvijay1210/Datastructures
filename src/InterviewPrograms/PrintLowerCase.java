package InterviewPrograms;

public class PrintLowerCase {
	
	
	public static String lowerCase(String string) {
		
		StringBuffer st = new StringBuffer();

		
		for(int i=0; i<string.length();i++) {
			 char c= string.charAt(i);
			 
			 if(Character.isLowerCase(c)) {
                    st.append(c);
                    st.append(" ");
			 }
			 
		}
		
	    return st.toString();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi Victor Vijay";
		System.out.println(lowerCase(str));
		
		
	}

}
