public class GameScoreboard
{
    public static void main(String[] args)
    {
        Integer[] scores = {10, null, 25, null, 40, 15};
        int notPlayed = 0;
        int total = 0;

        for(int i=0;i<scores.length;i++)
        {
            if(scores[i] == null)
            {
                notPlayed++;
            }
            else
            {
                total = total + scores[i];
            }
        }

        System.out.println(notPlayed);
        System.out.println(total);
    }
}