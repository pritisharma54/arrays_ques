
import java.util.*;

class Solution {
    static class Interval{
    int s;
    int e;
    public Interval(int s,int e){
        this.s=s;
        this.e=e;
    }
}
    
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        
        LinkedList<Interval> ll= new LinkedList<>();
        
        for(int[] temp:intervals){
            ll.add(new Interval(temp[0],temp[1]));
        }
        
//         Collections.sort(ll,new Comparator<>(){
//             public int compare(Interval a,Interval b){
//                 return a.s-b.s;
//             }
//         });
         Collections.sort(ll, (a, b) -> Integer.compare(a.s, b.s));
        
        LinkedList<Interval> result= new LinkedList<>();
        
        for(Interval curr:ll){
            if(result.isEmpty()||result.getLast().e<curr.s)
                result.add(curr);
            else{
                result.getLast().e=Math.max(curr.e,result.getLast().e);
                
            }
        }
        
        int [][] ans= new int[result.size()][2];
        
        for(int i=0;i<result.size();i++){
            ans[i][0]=result.get(i).s;
            ans[i][1]=result.get(i).e;
        }
        
        return ans;
        
    }
}
