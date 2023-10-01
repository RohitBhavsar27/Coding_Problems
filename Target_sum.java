package coding_questions;
import java.util.Arrays;

public class Target_sum {
	public static void main(String [] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		Target_sum sm = new Target_sum();
		int [] result1 = sm.twoSum(nums,target);
		System.out.println(Arrays.toString(result1));		
	}
	 public int[] twoSum(int[] nums, int target) {
		int [] result = new int [2];
		 for(int i = 0; i <nums.length; i++) {
			 for(int j = 1; j < nums.length; j++) {
				 if(nums[i] + nums[j] == target) {
					 result[0] = i;
					 result[1] = j;
				 }
			 }
		 }
//		 System.out.println(result);
		 return result;
	 }
}
