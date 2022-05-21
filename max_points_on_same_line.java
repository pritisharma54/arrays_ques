import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
//https://www.codingninjas.com/codestudio/problems/maximum-points-on-straight-line_1092972?leftPanelTab=0
public class Solution {
	public static int maxPointsOnLine(int[][] p, int n) {
		// Write your code here.
       
        
        if(n<=2)
            return n;
        
        int ans=0;
        for(int i=0;i<n;i++){
            
            HashMap<Double,Integer> mp= new HashMap<>();
            
            int samex=1;
            
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(p[i][0]==p[j][0]){
                     samex++;
                    continue;
                }
                
                double slope=(double)(p[j][1]-p[i][1])/(double)(p[j][0]-p[i][0]);
                
                if(!mp.containsKey(slope)){
                    mp.put(slope,2);
                }
                else{
                    mp.replace(slope,mp.get(slope)+1);
                }
            
            }
            
            for(Map.Entry x:mp.entrySet()){
                ans=Math.max(ans,(int)x.getValue());
                
                
            }
             ans=Math.max(ans,samex);
            
        }
        return ans;
	}
}
