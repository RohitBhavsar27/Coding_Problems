package coding_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Longest_Substring_without_Repeatition {

	public static void main(String[] args) {
		String s = "bbbbbb";
		
		Longest_Substring_without_Repeatition lswr = new Longest_Substring_without_Repeatition();
		int res2 = lswr.lengthOfLongestSubstring(s);
		System.out.println(res2);
	}
	
	public int lengthOfLongestSubstring(String s) {
		int res1 = 0;
		List<Integer> list = new ArrayList <Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				Character d = s.charAt(j);
				if (c.equals(d)) {
					list.add(j);
//					String str = s.substring(i, j);
//					System.out.println(str);
				}
			}
		}
//		for(int k = 0; k < list.size(); k++) {
//			System.out.println(list.get(k));
//		}
		int max = Collections.max(list);
		int min = Collections.min(list);
		res1 = (max+min)/2;
		return res1;
	}
}