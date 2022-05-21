https://www.geeksforgeeks.org/find-n-distinct-integers-with-zero-sum/
import java.util.ArrayList;
public class Solution 
{
    public static ArrayList<Integer> distinctZeroSum(int n) 
    {
        // Write your code here
        ArrayList<Integer> res= new ArrayList<>();
        
        for(int i=1;i<=n/2;i++){
            res.add(i);
            res.add(-i);
            
            
            if(n%2==1)
                res.add(0);
            
            
        }
        return res;
    }   
}
