package MathematicalPrograms;

public class FibonacciSeries {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34......
	//adding preeding of first two numbers (n1+n2)
	//formula n1+n2
	//n1=n2
	//sum=n2
	
	public static void fibbonaciSeries() {
		int n1=0;
	    int n2=1;
		int sum=0;
		
		for(int i=2;i<=10;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibbonaciSeries();
	}

}
