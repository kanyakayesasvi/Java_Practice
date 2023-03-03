package Problems;

import java.util.Arrays;

public class Product_of_Array_Except_Self_Division {
	public static void productExceptSelfDIv(int[] nums) {
		
		 int ans[]=new int[nums.length];
		 int p=1;
		 for(int i:nums) {
			 p*=i;
		 }
		 
		 for(int i=0;i<nums.length;i++) {
			
			 ans[i]=p/nums[i];
			 
		 }
		 System.out.println(Arrays.toString(ans));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		productExceptSelfDIv(nums);

		
		
		
		

	}

}
