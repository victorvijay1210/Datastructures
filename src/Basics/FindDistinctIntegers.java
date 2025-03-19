package Basics;

import java.nio.file.FileAlreadyExistsException;

public class FindDistinctIntegers {

    

    public static void main(String[] args) {
    	
    	
    	try {
            // Code that may throw multiple exceptions
            int num = 10 / 0;  // ArithmeticException
            
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
            
            String str = null;
            System.out.println(str.length());  // NullPointerException
            
            int value = Integer.parseInt("ABC");  // NumberFormatException
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } 
        
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Finally block executed.");
        }
    	
       
    }
}
