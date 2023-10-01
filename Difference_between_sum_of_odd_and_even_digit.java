//Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits

package coding_questions;

import java.util.Scanner;

public class Difference_between_sum_of_odd_and_even_digit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		String s = sc.nextLine();
		sc.close();
		cal_diff(s);
		
	}
	public static void cal_diff(String s) {
		String odd = "";
		String even = "";
		int sumOdd = 0;
		int sumEven = 0;
			
		for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
            	even = even + s.charAt(i);
            }
            else {
            	odd = odd +  s.charAt(i);
            }
		}
//		System.out.println("Odd: " + odd);
//        System.out.println("Even: " + even);
		
		for(int j = 0; j < odd.length(); j++) {
			sumOdd = sumOdd + odd.charAt(j)-48;
		}
//		System.out.println(sumOdd);
		
		for(int k = 0; k < even.length(); k++) {
			sumEven = sumEven + even.charAt(k)-48;	// we did -48 because ASCII value for numbers start from 48
		}
//		System.out.println(sumEven);
		
		System.out.println("Difference between sum of odd and even digit: " +Math.abs((sumEven-sumOdd)));
	}
	
}