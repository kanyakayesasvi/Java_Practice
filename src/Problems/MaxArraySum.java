package Problems;


public class MaxArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {-2,-1,-5};
	    System.out.println(getSubArrayLen(arr));
	    
	    int[] arr1= {-2,1,-3,4,-1,2,1,-5,4};
	    System.out.println(getSubArrayLen(arr1));
	    
	    int[] arr2= {5,4,-1,7,8};
	    System.out.println(getSubArrayLen(arr2));
	    
	    
		

	}
	
	public static int getSubArrayLen(int[] arr)//[-2,1,-3,4,-1,2,1,-5,4]
	{
		int curSum=0;
		int maxSum=0;
		int maxNum=arr[0];//-2
		for(int i=0;i<arr.length;i++) 
		{		
			if(arr[i]>maxNum) {//-2>-2
				maxNum=arr[i];
			}
			curSum+=arr[i];//-2
			if(curSum>maxSum) {//-2>0
				maxSum=curSum;
				
			}
			if(curSum<0) {//-2<0
				curSum=0;//0
			}
			}
			if(maxSum==0)//0==0
				maxSum=maxNum;//-2
		  
		
		  return maxSum;//-2
			
		
	
}
}


