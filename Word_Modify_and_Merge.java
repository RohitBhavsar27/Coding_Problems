package coding_questions;

import java.util.Scanner;

public class Word_Modify_and_Merge {
	public static void main(String[] args) {
		char[] vowel = {'a','e','i','o','u'};
		char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		Scanner sc = new Scanner(System.in);	
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		sc.close();
		
//		-*-*-*- CALLING NON STATIC METHOD -*-*-*-
//		Word_Modify_and_Merge wmag = new Word_Modify_and_Merge();
//		String res1 = wmag.replace_vowel(word1, vowel);
		
		String res1 = replace_vowel(word1,vowel);
		String res2 = replace_consonant(word2,consonant);
		String res3 = to_Uppercase(word3);
		
		System.out.println(res1+res2+res3);
		
	}
	public static String replace_vowel(String word1,char [] vowel) {
		if(isNumeric(word1)) {
			return word1;
		} else {
			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < vowel.length; j++) {
					if (word1.charAt(i) == vowel[j]) {
						word1 = word1.replace(vowel[j], '*');
					}
				}
			}
		}return word1;
	}
	
	public static String replace_consonant(String word2,char [] consonant) {
		if(isNumeric(word2)) {
			return word2;
		} else {
			for(int i = 0; i < word2.length(); i++) {
				for(int j = 0; j < consonant.length; j++) {
					if(word2.charAt(i) == consonant[j]) {
						word2 = word2.replace(consonant[j],'@');
					}
				}
			}
		}return word2;
	}
	public static String to_Uppercase(String word3) {
		if(isNumeric(word3)) {
			return word3;
		} else {
			word3 = word3.toUpperCase();
		}
		return word3;
	}
	public static boolean isNumeric(String input) {
		char [] nums = {'0','1','2','3','4','5','6','7','8','9'};
		boolean flag = false;
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < nums.length; j++) {
				if(input.charAt(i) == nums[j]) {
					flag = true;
				}
			}
		}return flag;
	}
}
