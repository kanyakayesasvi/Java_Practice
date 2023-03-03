package Problems;

import java.util.Arrays;

public class ArrayDuplicate {
	 static boolean Duplicate(int[] dupArr) {
		Arrays.sort(dupArr);
		for(int i=0;i<dupArr.length-1;i++) {
			if(dupArr[i]==dupArr[i+1]) {
				return true;
				
			}
		
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int [] dupArr= {1,2,3,4};
		int [] d2= { 1,1,1,3,3,4,3,2,4,2};
		System.out.println(Duplicate(dupArr));
		System.out.println(Duplicate(d2));
		

	}

}
