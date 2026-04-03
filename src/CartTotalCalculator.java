public class CartTotalCalculator
{
    public static void main(String[] args)
    {
        String[] prices = {"250","499","99","abc","150"};
        int total = 0;
        for(int i=0;i<prices.length;i++)
        {
            try
            {
                total = total + Integer.parseInt(prices[i]);
            }
            catch(Exception e)
            {
            }
        }
        System.out.println("Total price = " + total);
    }
}