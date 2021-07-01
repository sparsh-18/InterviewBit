  public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
 
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        Collections.sort(intervals, new mysort());

        for (int i = 0; i<intervals.size()-1; i++) {
            Interval next = intervals.get(i+1);
            Interval curr = intervals.get(i);

            if(next.start > curr.end)
                continue;
            else {
                Interval in = new Interval(curr.start, Math.max(curr.end, next.end));
                intervals.set(i, in);
                intervals.remove(i+1);
                i--;
            }
        }

        return intervals;
    }
    
}

class mysort implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        return a.start > b.start ? 1 : -1;
    }
}
