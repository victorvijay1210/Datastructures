package CoreConcepts.Map;

//Find missing numbers in below given array : 
//arr[]={1,3,5,7,9,8,4}; given size=9; o/p should be = 2,6

public class MissingNumbers{
	
	public static void findMissing(int[] array,int size) {
		
		boolean[] present = new boolean[size +1];//to track size 0 to 9
		
		for(int i=0;i<array.length;i++) {//adding as true since the default boolean value is false
			present[array[i]]=true;
 		}
		
		System.out.println("The Missing Numbers:");
		for(int i=1;i<size;i++) {
			
			if(!present[i])	{
           System.out.println(i);
		   }
			}
		
		
	}
	
	
	public static void main(String[] args) {
		int[] array ={1,3,5,7,9,8,4};
		int size=9; 
		
		findMissing(array, size);
	}
}
