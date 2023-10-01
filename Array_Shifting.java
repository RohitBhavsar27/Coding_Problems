package coding_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Shifting {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of Elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Shifting Parameter: ");
		int k = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter Elements Separated by Space: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		array_shift(arr,k);
	}
	public static void array_shift(int [] arr, int k) {
		int temp = 0;
		for(int j = 0; j < k; j++) {
			temp = arr[arr.length - 1];
			for (int l = arr.length - 1; l > 0; l--) {
				arr [l] = arr[l- 1];
			}
			arr[0] = temp;
		}			
		System.out.println("Array after Shifting: " + Arrays.toString(arr));
	}
}
