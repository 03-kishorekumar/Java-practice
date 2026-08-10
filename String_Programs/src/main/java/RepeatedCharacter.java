
import java.util.*;

public class RepeatedCharacter {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to find the Repeating characters ");

        String word = sc.nextLine().toLowerCase();

        Map<Character,Integer> hm = new HashMap<>();

        for (char ch : word.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }

//        System.out.println("All Repeating characters are ");
//
//        boolean found = false;
//
//        for (Map.Entry<Character,Integer> entry : hm.entrySet())
//        {
//            if (entry.getValue()>1)
//            {
//                System.out.println(entry.getKey() + " ");
//                found = true;
//            }
//        }
//
//        if (!found)
//        {
//            System.out.println("No Repeating characters found");
//        }

        System.out.println(" First Repeating character : ");

        boolean found = false;

        for (char ch : word.toCharArray())
        {
            if (hm.get(ch) > 1)
            {
                System.out.println(ch + " ");
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("No First Repeating characters are found");
        }

    }
}
