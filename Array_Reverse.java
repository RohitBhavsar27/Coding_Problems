package coding_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of testcases: ");
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			System.out.println("Enter no of Elements and index: ");
			int N = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("Enter Elements separated by space ");
			for (int j = 0; j < N; j++) {
				int integers = sc.nextInt();
				arr.add(integers);
			}
			reverseArray(arr,m);
		}
		
    }
	public static void reverseArray(ArrayList<Integer> arr, int m) {
		ArrayList<Integer> sublist = new ArrayList<Integer>(arr.subList(m + 1, arr.size()-1));
	   
	    Collections.reverse(sublist);
	    arr.subList(m + 1, arr.size()).clear();
	    arr.addAll(sublist);
	   
	    System.out.println(arr);
	  }
	}


