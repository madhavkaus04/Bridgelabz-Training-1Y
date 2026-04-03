public class UserInputValidation
{
    public static boolean isValidAge(String input)
    {
        try
        {
            int age = Integer.parseInt(input);
            if(age >= 18)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(isValidAge("20"));
        System.out.println(isValidAge("15"));
        System.out.println(isValidAge("abc"));
    }
}