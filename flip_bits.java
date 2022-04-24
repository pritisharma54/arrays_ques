public class Solution {
//https://www.codingninjas.com/codestudio/problems/flip-bits_1063248?leftPanelTab=0
	
  public static int flipBits(int[] arr,int n) {
		int totalOnes = 0;

		// Initialize overall maximum difference for any subArray
		int max = 0;

		// Initialize current difference
		int currMax = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 1) {
				totalOnes++;
			}

			// Value to be considered for finding maximum sum
			int val = 0;
			if (arr[i] == 1) {
				val = -1;
			} else {
				val = 1;
			}

			currMax = Math.max(val, currMax + val);
			max = Math.max(max, currMax);
		}
		max = Math.max(0, max);
		int result = totalOnes + max;
		return result;
	}
}


