package LinkedInInterviewPrograms;

import java.util.Arrays;

/*
 * Write a program to reverse only smallest and Largest words in a given string?
String str= "Java is Beautiful programming"
o/p: Java si Beautiful gnimmargorp
 */
public class ReverseLargestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is Beautiful programming";
	    String[] st=str.split(" ");
	    System.out.println(Arrays.toString(st));
	    int max=st[0].length();
	    int min=st[0].length();
	    
	    String largest="";
	    String smallest="";
	    
	    for(String s:st) {
	    	if(s.length()>max) {
	    		largest=s;
	    		continue;
	    	}
	    	else if(s.length()<min) {
	    		smallest=s;
	    	}
	    }
	    
	   
		
	    System.out.println("Largest Word"+" "+ largest);
	    System.out.println("Smallest Word"+" "+ smallest);
	    
	    StringBuilder largeReverse = new StringBuilder(largest).reverse();
	    StringBuilder smallReverse = new StringBuilder(smallest).reverse();
	    StringBuilder data  = new StringBuilder();
	    
	    for(String s:st) {
	    	
	    	
	    	if(s.equalsIgnoreCase(smallest)) {
	    		data.append(smallReverse).append(" ");
	    	}
	    	else if(s.equalsIgnoreCase(largest)) {
	    		data.append(largeReverse).append(" ");
	    	}
	    	else {
	    		data.append(s).append(" ");
	    	}
	    }
	    
	    System.out.println(data.toString());

	}

}
