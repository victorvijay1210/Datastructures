package Top20JavaPrograms;

public class ReverseWordInSentance {
	
	
	public static String revSentance(String str) {
		
		String[] s= str.split(" ");
		StringBuilder res = new StringBuilder();
		
		if(s.length==0) {
			return null;
		}
		
		for(int i=s.length-1; i>=0;i--) {
			
			res.append(s[i]).append(" ");
		}
		
		
		return res.toString();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i like this program very much
		System.out.println(revSentance("i like this program very much"));

	}

}
