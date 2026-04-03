import java.util.ArrayList;

public class StudentMarksReport
{
    public static void main(String[] args)
    {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<inputs.length;i++)
        {
            try
            {
                if(inputs[i] instanceof String)
                {
                    String s = (String)inputs[i];
                    if(!s.equals("null"))
                    {
                        list.add(Integer.parseInt(s));
                    }
                }
                else if(inputs[i] instanceof Integer)
                {
                    list.add((Integer)inputs[i]);
                }
            }
            catch(Exception e)
            {
            }
        }

        int sum = 0;
        int count = 0;

        for(int i=0;i<list.size();i++)
        {
            sum = sum + list.get(i);
            count++;
        }

        double avg = (double)sum / count;
        System.out.println(avg);
    }
}