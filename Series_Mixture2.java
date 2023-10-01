//-1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
//-This series is a mixture of 2 series fail the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order
//-Write a program to find the Nth term in this series
//-The value N in a positive integer that should be read from mm. The Nth term that is calculated by the program should be written to STDOUT Otherthan the value 
//of Nth term , no other characters / string or message should be written to STDOUT.
//-For example, when N:14, the 14th term in the series is 17 So only the value 17 should be printed to STDOUT

package coding_questions;

import java.util.Scanner;

public class Series_Mixture2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of term: ");
		int n = sc.nextInt();
		sc.close();
		 if(n%2 == 1) {
			 fibonacci (n/2 + 1);
		 } else { 
		   prime(n/2);
		 }
	}
	
	public static void fibonacci(int n) {
		int a = 0, b = 1, next = 0;
		for (int i = 1; i<=n; i++)
	    {
	        next = a + b;
	        a = b;
	        b = next;
	    }
		System.out.println("Value of Nth term: " + a);
	}
	
	public static void prime(int n) {
		int max = Integer.MAX_VALUE;
		int i = 0, j = 0, count = 0;
		for (i = 2; i <= max; i++){
	        boolean flag = false;
	        for(j = 2; j < i; j++){
	        	if(i % j == 0) {
	        		flag = true;
	        		break;
	        	}
	        }
	        if(flag == false) {
	        	if(++count == n) {
	        		System.out.println("Value of Nth term: " + i);
	        		break;
	        	}
	        }
		}
	}
}


