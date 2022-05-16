//https://classroom.codingninjas.com/app/practice/2245719/14481/largest-number-x-which-occurs-x-times
import java.util.*;

public class Solution {
    public static int findX(int[] arr) {
        // Write your code here.
        if(arr==null||arr.length==0) return 0;
        
       Map<Integer,Integer> mp= new HashMap<>();
        int res=0;
        
        for(int  x:arr){
            
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
             int k=entry.getKey();
             int v=entry.getValue();
            
            if(k==v){
                res=Math.max(res,k);
            }
       
        }
        
        return res;
        
    }
}
