package Problems;

import java.util.*;

public class TwoSum {
	public static void sum(int[] s,int target) {
		int temp=0;
		int[] a=new int[2];
		
		Map<Integer,Integer> sm= new HashMap<>();
	
		for(int i=0;i<s.length;i++) 
		{
			sm.put(s[i],i);
		}
		for(int i=0;i<s.length;i++){
			temp=target-s[i];
			if(sm.containsKey(temp) && sm.get(temp)!=i){
				
				a[0]=i;
				a[1]=sm.get(temp);
				System.out.println("a[0] ="+ s[0]);
				System.out.println("a[1]= "+s[1]);
			//	return a;
				
				}
			
//			System.out.println(sm.containsValue(temp));
		}
		a[0]=-1;
		a[1]=-1;

		
		
	//	return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1= {2,7,11,15};
		int target1=9;
		sum(s1, target1);

		int[] s2= {3,2,4};
		int target2=6;
		sum(s2, target2);
		
		int[] s3= {3,3};
		int target3=6;
		sum(s3, target3);
		

	}

}
