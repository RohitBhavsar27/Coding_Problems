//Find the nth term of the series.
//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
//Hint  = 2^(0), 3^(0),2^(1), 3^(1),2^(2), 3^(2),2^(3), 3^(3),2^(4), 3^(4),2^(5), 3^(5),2^(6), 3^(6) ….
//
//This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another 
//geometric series. Write a program to find the Nth term in the series.
//-The value N in a positive integer that should be read from STDIN.
//-The Nth term that is calculated by the program should be written to STDOUT.
//-Other than value of n th term,no other character / string or message should be written to STDOUT.
//-For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
//-You can assume that N will not exceed 30.

package coding_questions;

import java.util.Scanner;

public class Nth_Term_of_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which Nth term you Have to find: ");
		int input  = sc.nextInt();
		sc.close();
		
		if(input != 0) {
			if(input % 2 == 0) {
				int power = (input/2) - 1;
				double term = Math.pow(3, power);
				System.out.println("The Nth term is: " + String.format("%.0f", term));	// String.format is used to limit the precision of double
			} else {
				int power = (input - 1)/2;
				double term = Math.pow(2, power);
				System.out.println("The Nth term is: " + String.format("%.0f", term));
			}
		}	

	}

}
