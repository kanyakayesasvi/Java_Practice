package Problems;

import java.util.*;

public class ArrayDuplicateHashSet {
	static boolean DuplicateSet(int[] arrdup) {
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<arrdup.length;i++) {
			if(s.contains(arrdup[i])) {
				return true;
			}
			s.add(arrdup[i]);
			
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dupArr= {1,2,3,4};
		int [] d2= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(DuplicateSet(dupArr));
		System.out.println(DuplicateSet(d2));


	}

}
