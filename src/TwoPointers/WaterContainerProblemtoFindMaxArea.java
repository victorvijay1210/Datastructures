package TwoPointers;

public class WaterContainerProblemtoFindMaxArea {
	
	/**
	To find length neeed to subract from higher no to lower no
	so j-i
	
	To find area the formula is length* height
	
	To find height we need to take minimum value **/
	
	
	public static int findMaxArea(int[] heightarray){
		
		int leftpointer = 0;
		int rightpoint = heightarray.length-1;
		int maxarea=0;
		while (leftpointer<rightpoint) {
			
			int length = rightpoint-leftpointer;
			int height = Math.min(heightarray[rightpoint], heightarray[leftpointer]);
			int area= length * height;
			maxarea=Math.max(maxarea, area);
			
			if (heightarray[leftpointer] < heightarray[rightpoint]) {
				leftpointer++;
			}
			else {
				rightpoint--;
			}
		}

		
		return maxarea ;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] height1 = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(findMaxArea(height1));  //output 49
		
		int[] height2 = {1,1};
		
		System.out.println(findMaxArea(height2));  //output 1
		
	}

}
