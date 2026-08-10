
import java.util.*;

public class DuplicateCharacter {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the word to find the duplicate characters : ");

        String word = sc.nextLine().toLowerCase();

        Set<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray())
        {
            if (!hs.contains(c))
            {
                hs.add(c);
                sb.append(c);
            }
        }

        System.out.println( "String after removing duplicates: " + sb);

        System.out.println(" counting the duplicate characters ");

        Map<Character,Integer> hm = new HashMap<>();

        for (char ch : word.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch, hm.get(ch) + 1);
            }
            else
            {
                hm.put(ch, 1);
            }
        }

        System.out.println("Duplicate characters and their counts:");

        for (Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
