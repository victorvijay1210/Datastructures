package MathematicalPrograms;

public class factorial {
	
	//factorial 4!=4*3*2*1 or 4*3!
	//factorial 3!=3*2*1
	//factorial 2!=2*1
	//factorial 1=1
	
	//using recursion
	public static int factorialNo(int n) {
		
		if(n==1) return 1;
		return n * factorialNo(n-1);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorialNo(4));

	}

}
