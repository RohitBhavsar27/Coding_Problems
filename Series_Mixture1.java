package coding_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Series_Mixture1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res1 = series(n);
		System.out.println(res1);
	}
	
	public static int series(int n) {
		int a = 0;
		int b = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				if (i > 1)
					a = a + 2;
			} else {
				b = a / 2;
			}
		}
		int [] arr = new int[2];
		if (n % 2 != 0) {
			return a; 
		} else {
			return b; 
		}
	}
}
