public class WrapperToPrimitiveConversion
{
    public static void main(String[] args)
    {
        Double obj = 45.67;
        double d = obj.doubleValue();
        int i = (int)d;
        System.out.println(d);
        System.out.println(i);
    }
}