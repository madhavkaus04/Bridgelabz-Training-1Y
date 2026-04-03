import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAgeAnalytics
{
    public static void main(String[] args)
    {
        int[] ages = {25, 30, 22, 40, 28};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ages.length;i++)
        {
            list.add(ages[i]);
        }
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println(youngest);
        System.out.println(oldest);
    }
}