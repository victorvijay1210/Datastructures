package InterviewPrograms;

public class SecondMaxNo {
	
	//space complexity is O(1).
	//time complexity is O(1).
	public static int findSecondMaxNo(int[] nums) {
		
		int max= nums[0];
		int secondmax=nums[0];
		
		for(int num:nums) {
			
			if(num>max) {
				max=num;
			}
			else if(num<max && num!=max) {
				secondmax=num;
			}
		}
		
		
		
		
		return secondmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbs = {1,2,25,16,7,8,18,19,21};
   System.out.println(findSecondMaxNo(numbs));
	}

}
