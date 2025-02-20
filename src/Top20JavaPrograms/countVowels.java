package Top20JavaPrograms;

public class countVowels {

	public static int vowelsCount(String str) {
		
		
		int vowelsCount =0;
		
	    for(int i=0;i<str.length();i++) {
	    	
	    	char c = str.charAt(i);
	    	
	    	if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'){
	    		
	    		vowelsCount++;
	    			
	    	}
	    	
	    			
	    	
	    	
	    }
		
		
		
		return vowelsCount;
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(vowelsCount("Vijay"));
	}
	
}