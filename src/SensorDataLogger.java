import java.util.ArrayList;

public class SensorDataLogger
{
    public static void logData(double value, ArrayList<Double> list)
    {
        list.add(value);
    }

    public static void logData(Double value, ArrayList<Double> list)
    {
        list.add(value);
    }

    public static void main(String[] args)
    {
        ArrayList<Double> data = new ArrayList<Double>();
        logData(25.5, data);
        logData(Double.valueOf(30.2), data);
        double sum = 0;
        for(int i=0;i<data.size();i++)
        {
            sum = sum + data.get(i);
        }
        System.out.println(sum);
    }
}