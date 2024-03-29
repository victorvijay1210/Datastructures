package InterviewPrograms;

public class TruncateSentance {
	
	public static String truncate(String s, int k) {
		
		String[] str=  s.split(" ");
		int i=0;
		StringBuffer truncatestring = new StringBuffer();
		
		while(i<k) {
			truncatestring.append(str[i]).append(" ");
			i++;
		}
		
		
		
		return truncatestring.toString().trim();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello how are you Contestant";
         System.out.println(truncate(s, 4));
	}

}
