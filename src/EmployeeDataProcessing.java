import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing
{
    public static void main(String[] args)
    {
        int[] ages = {25, 30, 22, 40, 28};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ages.length;i++)
        {
            list.add(ages[i]);
        }
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min);
        System.out.println(max);
    }
}