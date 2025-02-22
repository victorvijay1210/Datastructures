package Top20JavaPrograms;

public class RemoveConsecutiveDuplicate {

	public static String removeConsecutiveDup(String str) {
		
		if(str.length()<2) {
			return str;
		}
		
		
		StringBuilder res = new StringBuilder();
		
		res.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
		
			if(str.charAt(i)!= str.charAt(i-1)) {
				res.append(str.charAt(i));
			}
		}
		
		
		
		return res.toString();
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aabcca
		//geeks
		System.out.println(removeConsecutiveDup("geeks"));
		System.out.println(removeConsecutiveDup("aabcca"));

	}

}
