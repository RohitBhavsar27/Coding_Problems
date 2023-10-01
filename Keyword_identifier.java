package coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Keyword_identifier {

	public static void main(String[] args) {

		String[] keywords = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if",
				"map", "range", "return", "struct", "type", "var" };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		
//		-*-*-*- METHOD 1 -*-*-*-
		
		boolean flag = false;
		
		for(int i = 0; i < keywords.length; i++) {
			if (word.equals(keywords[i])){
				flag = true;
			}
		}
		if(flag == true) {		
			System.out.println(word + " is keyword");
		} else {
			System.out.println(word + " is not keyword");
		}
		
		
//		-*-*-*- METHOD 2 -*-*-*-
		
		List<String> list = Arrays.asList(keywords);
		
		if(list.contains(word)){
			System.out.println(word + " is keyword");
		} else {
			System.out.println(word + " is not keyword");
		}
	}
}
