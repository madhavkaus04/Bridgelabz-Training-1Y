import java.util.ArrayList;
import java.util.Objects;
public class ProductRatingsAnalyzer
{
    public static void main(String[] args)
    {
        int[] ratingsArray = {4, 5, 3, 4};
        ArrayList<Integer> ratingsList = new ArrayList<Integer>();
        ratingsList.add(5);
        ratingsList.add(null);
        ratingsList.add(3);
        ratingsList.add(4);
        ArrayList<Integer> combined = new ArrayList<Integer>();
        for(int i=0;i<ratingsArray.length;i++)
        {
            combined.add(ratingsArray[i]);
        }
        for(int i=0;i<ratingsList.size();i++)
        {
            combined.add(ratingsList.get(i));
        }
        int sum = 0;
        int count = 0;

        for(int i=0;i<combined.size();i++)
        {
            if(Objects.nonNull(combined.get(i)))
            {sum = sum + combined.get(i);
                count++;
            }
        }
        double avg = (double)sum / count;
        System.out.println(avg);
    }
}