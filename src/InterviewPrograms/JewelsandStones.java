package InterviewPrograms;

public class JewelsandStones {
	
	public static int countJewels(String jewels, String stones) {
		
		int count=0;
		
		for(char stone:stones.toCharArray()) {
			
			if(jewels.contains(String.valueOf(stone))) {
				count++;
			}
		}
		
		
		return count; 
		
		
	}
	
	

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		String jewels ="aA";
		String stones ="aAAbbbb";
      System.out.println(countJewels(jewels, stones));
	}

}
