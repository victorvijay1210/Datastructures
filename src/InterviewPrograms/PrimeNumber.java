package InterviewPrograms;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num;i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
      System.out.println(isPrimeNumber(num));
	}

}
