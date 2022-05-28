//https://www.youtube.com/watch?v=fix5H8erZXY
public class Solution {
    public int mice(ArrayList<Integer> mices, ArrayList<Integer> holes) {
        Collections.sort(mices);
        Collections.sort(holes);

        int ans=Integer.MIN_VALUE;

        for(int i=0;i<mices.size();i++){

            int temp=Math.abs(mices.get(i)-holes.get(i));
            ans=Math.max(temp,ans);
        }

        return ans;
    }
}
