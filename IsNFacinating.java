package coding_questions;

public class IsNFacinating {

	public static void main(String[] args) {
		int n = 334; 
		System.out.println(isNumberFacinating(n));;
	}
	
	public static boolean isNumberFacinating(int n) {
		
		int n1 = (n*2);
		int n2 = (n*3);
		
		String s = Integer.toString(n);
		String s1 = Integer.toString(n1);
		String s2 = Integer.toString(n2);
		
		String str = s + s1 + s2;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) > 48 && str.charAt(i) <= 57) {
				for(int j = 0; j < str.length(); j++) {
					for(int k = j + 1; k < str.length(); k++) {
						if(str.charAt(j) == str.charAt(k)) {
							return false;
						}
					}
				} 	
			}
		}return true;
	}
}

