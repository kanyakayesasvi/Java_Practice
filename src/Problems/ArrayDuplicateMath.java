package Problems;

import java.util.*;

public class ArrayDuplicateMath {
	static Boolean DuplicateMath(int[] arrdup) {
		int sum=0;
		int setsum=0;
		for(Integer i:arrdup) {
			 sum+=i;
			 //System.out.println(sum);
		}
	    Set<Integer> s=new HashSet<>();
	    for( Integer i:arrdup) {
	    	s.add(i);
	    }
	    for(Integer i:s) {
	    	setsum+=i;
	    	//System.out.println(setsum);
	    }
	    
		return setsum!=sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] dupArr= {1,2,3,4};
		int [] d2= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(DuplicateMath(dupArr));
		System.out.println(DuplicateMath(d2));



	}

}
