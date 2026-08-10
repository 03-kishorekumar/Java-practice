

import java.util.*;

public class vowels_Frequency {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the word to find the vowels frequency : ");

        String word = sc.nextLine().toLowerCase();

        Map<Character,Integer> hm = new HashMap<>();

        for (char ch : word.toCharArray() )
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                hm.put(ch, hm.getOrDefault(ch,0) + 1);
            }
            else
            {
                hm.put(ch, 1);
            }
        }

        System.out.println(" The vowels frequency : ");

        for (Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
