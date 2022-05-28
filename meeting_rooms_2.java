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
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        if(intervals==null||intervals.size()==0)
            return 0;

        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.start-b.start;
            }
        });
        PriorityQueue<Interval> pq= new PriorityQueue<Interval>(new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.end-b.end;
            }
        });
        pq.add(intervals.get(0));
       
        for(int i=1;i<intervals.size();i++){
            Interval curr=intervals.get(i);
            Interval prev=pq.poll();


            if(prev.end>curr.start){
                //we need two meeting rooom for them as intersecting
                pq.add(prev);
                pq.add(curr);
            }
            else{
                prev.end=curr.end;
                pq.add(prev);
            }
           
        }

        return pq.size();
    }
}
@@@@@@
/*
	Time Complexity: O(N logN)
	Space complexity: O(N)
	
	where N is the number of intervals.
*/

import java.util.Arrays;
public class Solution {

	public static int minRooms(int[][] intervals) {

		int N = intervals.length;
		
        // Storing start time and end time in different arrays.
        int[] startTime = new int[N];
		int[] endTime = new int[N];

		for(int i=0;i<N;i++) {
			startTime[i] = intervals[i][0];
			endTime[i] = intervals[i][1];
		}
		
        Arrays.sort(startTime);
		Arrays.sort(endTime);
		
        int result = 1;
		int roomRequired = 0;
		
        int i = 0, j = 0;
		while(i < N && j < N){
		
            if(startTime[i] < endTime[j]){
		        roomRequired++;
		        i++;
		    }else{
		        roomRequired--;
		        j++;
		    }
		
            result = Math.max(result, roomRequired);
		}
		
        return result;
	}
}
