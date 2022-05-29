/*
    Time Complexity : O(N * log(N))
    Space Complexity : O(1)

    Where N is the size of the input array
*/
import java.util.Arrays;
public class Solution 
{
	public static long pairsWithGivenSum(int arr[], int sum) 
    {
		int n = arr.length;
		long ans = 0L;

		Arrays.sort(arr);

		// Take two pointers
		int i = 0, j = n - 1;

		while (i < j) 
        {
			// If sum is greater
			if (arr[i] + arr[j] < sum) 
            {
				i++;
			}
			
            // If sum is lesser
			else if (arr[i] + arr[j] > sum) 
            {
				j--;
			}
			
            // If sum is equal
			else 
            {
				// Find the frequency of arr[i]
				long initialLeftElement = arr[i], initialLeftIndex = i;

				while (i < j && arr[i] == initialLeftElement) 
                {
					i++;
				}

				// Find the frequency of arr[j]
				long initialRightElement = arr[j], initialRightIndex = j;
        //didnt got j>=i logic
				while (j >= i && arr[j] == initialRightElement) 
                {
					j--;
				}

				// If arr[i] and arr[j] are the same then it gets counted twice so subtract 1
        
				if (initialLeftElement == initialRightElement) 
                {
          //total numbers
					long equalNumbers = (i - initialLeftIndex) + (initialRightIndex - j) - 1;
          //pair formed with numbers
					ans += (equalNumbers * (equalNumbers + 1)) / 2;
				} 
                else 
                {
					ans += ((i - initialLeftIndex) * (initialRightIndex - j));
				}
			}
		}

		return ans;
	}

}



@@@@@@@

/*
    Time Complexity : O(N)
    Space Complexity : O(N)
    
    Where N is the size of the input array
*/

import java.util.HashMap;
import java.util.Map;

public class Solution 
{

	public static long pairsWithGivenSum(int arr[], int sum) 
    {
		int n = arr.length;
		
	    Map<Integer, Integer> mp = new HashMap<>();
	    long ans = 0L;
	
	    
	    for (int i = 0; i < n; i++) 
        {
	        int complement = sum - arr[i];
	
	        if (mp.containsKey(complement)) 
            {
	            ans += mp.get(complement);
	        }
	
	        if (!mp.containsKey(arr[i])) 
            {
	        	mp.put(arr[i], 1);
	        } 

            //Increase the count of arr[i] in the hashmap/dictionary by 1
            else 
            {
	        	mp.put(arr[i], mp.get(arr[i]) + 1);
	        }
	    }
	
	    return ans;
	}

}
