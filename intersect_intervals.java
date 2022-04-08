class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        
        if(a==null||a.length==0&&b==null||b.length==0)
            return new int[0][0];
        int i=0,j=0;
        
        ArrayList<int[]> res= new ArrayList<>();
        
        while(i<a.length&&j<b.length){
            
            int max=Math.max(a[i][0],b[j][0]);
            int min=Math.min(a[i][1],b[j][1]);
            
            if(max<=min){
                res.add(new int[]{max,min});
            }
            
            if(a[i][1]<b[j][1])
                i++;
            else
                j++;
        }
        
        
        int[][] ans= new int[res.size()][2];
        i=0;
        
        for(i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        
        return ans;
    }
}
