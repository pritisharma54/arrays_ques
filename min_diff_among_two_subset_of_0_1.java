/*  https://www.codingninjas.com/codestudio/contests/codestudio-monthly-contest-1/problems/17817?leftPanelTab=0
    Time Complexity: O(N)
    Space Complexity: O(1)
    where 'N' is the number of elements.
*/

public class Solution {

    static int minimumDifference(int n, int arr[]) {
        int countOnes = 0;

        // Count number of 1s.
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 1) {
                countOnes++;
            }
        }

        // If countOnes is odd.
        if (countOnes % 2 == 1) {
            // Return 1.
            return 1;
        }

        // If countOnes is even.
        else {
            // Return 0.
            return 0;
        }
    }
}
