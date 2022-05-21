//https://www.geeksforgeeks.org/longest-zig-zag-subsequence/
public class Solution 
{
    public static int  signum(int n){
        
        if(n!=0)
            return n > 0 ? 1:-1;
        else 
            return 0;
    }
    public static int zigZagSubsequence(int[] seq) 
    {
        // Write your code here
        int n= seq.length;
        if(n==0)
            return 0;
        
        int length=1,lastSign=0;
        
        for(int i=1;i<seq.length;i++){
            	
            int sign=signum(seq[i]-seq[i-1]);
            
            if(sign!=0&&sign!=lastSign){
                lastSign=sign;
                length++;
            }
            
           
        }
        
        return length;
    }   
}
