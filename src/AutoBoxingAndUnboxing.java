import java.util.ArrayList;

public class AutoBoxingAndUnboxing
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(5);
        int sum = 0;
        for(int i=0;i<list.size();i++)
        {
            sum = sum + list.get(i);
        }
        System.out.println("Sum of numbers = " + sum);
    }
}