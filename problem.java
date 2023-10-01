package coding_questions;
import java.util.*;
public class problem {
	

	static String findStableNumber(int k, String s) {
		
	    StringBuilder curr = new StringBuilder();
	    
	    for (int i = 0; i < s.length(); i++) {
	        curr.append(s.charAt(i % k));
	    }
	    System.out.println(curr);
	    
	    if (curr.toString().compareTo(s) >= 0) {
	    	return curr.toString();
	    }
	    
	    int index = k - 1;
	    while (index >= 0 && curr.charAt(index) == '9') {
	        curr.setCharAt(index, '0');
	        index--;
	    }
	    curr.setCharAt(index, (char) (curr.charAt(index) + 1));
	    
	    for (int i = 0; i < s.length(); i++) {
	    	curr.setCharAt(i, curr.charAt(i % k));
	    }
	    
	    return curr.toString();
	}
	
	public static void main(String [] args) {
		findStableNumber(2,"6825"); 
	}
}