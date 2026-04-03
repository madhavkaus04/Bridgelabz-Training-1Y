import java.util.ArrayList;

public class PerformanceImpactWrapperClasses
{
    public static void main(String[] args)
    {
        int n = 1000000;

        int[] arr = new int[n];
        long start1 = System.nanoTime();
        for(int i=0;i<n;i++)
        {
            arr[i] = i;
        }
        long sum1 = 0;
        for(int i=0;i<n;i++)
        {
            sum1 = sum1 + arr[i];
        }
        long end1 = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<Integer>();
        long start2 = System.nanoTime();
        for(int i=0;i<n;i++)
        {
            list.add(i);
        }
        long sum2 = 0;
        for(int i=0;i<list.size();i++)
        {
            sum2 = sum2 + list.get(i);
        }
        long end2 = System.nanoTime();

        System.out.println(sum1);
        System.out.println(end1 - start1);
        System.out.println(sum2);
        System.out.println(end2 - start2);
    }
}