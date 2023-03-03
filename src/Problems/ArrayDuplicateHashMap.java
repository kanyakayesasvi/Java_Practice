package Problems;

import java.util.*;

public class ArrayDuplicateHashMap {
	static Boolean DuplicateMap(int[] arrdup) {
		Map<Integer,Integer> m= new HashMap<>();
		for(int i=0;i<arrdup.length;i++) {
			if(m.containsKey(arrdup[i])) {
				return true;
			}
			m.put(arrdup[i], 1);
			
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dupArr= {1,2,3,4};
		int [] d2= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(DuplicateMap(dupArr));
		System.out.println(DuplicateMap(d2));

	}

}
