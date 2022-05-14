//https://www.codingninjas.com/codestudio/contests/codestudio-weekend-contest-20/problems/18731?leftPanelTab=0
public class Solution {

	public static int maximizeTheProduct(int[] arr) 
	{
		// Write your code here.
		long sum=0;
		long ls=0;
		
		long maxproduct=-1000000007;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			ls+=arr[i];
			sum=sum-arr[i];
			long temp=ls*sum;
			
			if(i!=arr.length-1)
				maxproduct=Math.max(maxproduct,temp);
		}
		maxproduct = (maxproduct+1000000007) % 1000000007;
		
		return (int)maxproduct;
		
	}
		
	}
