package coding_questions;

import java.util.Arrays;

public class NotMinMax {

	public static void main(String[] args) {
		int [] arr = {3,2,1,4};
		
		System.out.println("Output: " + findOtherthanMinMax(arr));
	}
	
	public static int findOtherthanMinMax(int [] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != min && arr[i] != max) {
				return arr[i];
			} 
		}
		return -1;
	}
		
}


