package Problems;

public class Product_of_Array_Except_Self {
	public static void productExceptSelfBFT(int[] nums) {
		
		int l=nums.length;
		int ans[]= new int[l];
		for(int i=0;i<l;i++) {
			int p=1;
			for(int j=0;j<l;j++) {
				if(i==j) {
					continue;
				}
				p*=nums[j];
			}
			ans[i]=p;
		}
		
		for(int i:ans) {
		System.out.println(i);}
		
//		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		productExceptSelfBFT(nums);
		

	}

}
