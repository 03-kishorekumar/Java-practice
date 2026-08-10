
import java.util.*;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sc.nextLine();

        System.out.println("Reversed String : " + new StringBuilder(str).reverse().toString());
    }

}
