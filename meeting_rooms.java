/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        if(intervals==null||intervals.size()==0)
            return true;

        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.start-b.start;
            }
        });

        Interval prev=intervals.get(0);

        for(int i=1;i<intervals.size();i++){
            Interval curr=intervals.get(i);

            if(prev.end>curr.start)
                return false;

            prev=curr;
        }

        return true;
    }
}

//if input given as int[][] intervals
 Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });

