package coding_questions;

public class Palindrome {

	public static boolean isPalindrome(int x) {
        boolean flag = false;
        int reverse = 0;
        int remainder = 0;
        Integer temp = x;
        while(x != 0) {  
            remainder = x % 10;  
            reverse = reverse * 10 + remainder;  
            x = x/10;  
        }
        if(temp < 0) {
        	flag = false;
		}else if(temp.equals(reverse)){
            flag = true;
        }return flag;  
    }
	public static void main(String [] args) {
		boolean res1 = isPalindrome(121);
		System.out.println(res1);
	}
}