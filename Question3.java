import java.util.ArrayList;
import java.util.List;

public class Question3
{
    public static class Interval 
    {
        int start;
        int end;

        public Interval(int s, int e)
        {
            start = s;
            end = e;
        }
    }
    public static void mergeIntervals(List<Interval> intervals)
    {
        if (intervals.isEmpty()) 
        {
            return;
        }

        int j = 0;
        for (int i = 1; i < intervals.size(); i++) 
        {
            Interval curr = intervals.get(i);
            Interval prev = intervals.get(j);

            if (curr.start <= prev.end) 
            {
                prev.end = curr.end > prev.end ? curr.end : prev.end;
            }
            else
            {
                j++;
                intervals.set(j, curr);
            }
        }
    }

    public static void main(String[] args)
    {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        mergeIntervals(intervals);

        for (Interval interval : intervals) 
        {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
