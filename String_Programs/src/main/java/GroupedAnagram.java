
import java.util.*;

public class GroupedAnagram {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the size of the array : ");

        int size = sc.nextInt();

        String[] words = new String[size];

        System.out.println(" Enter the words : ");

        for (int i = 0; i < size; i++)
        {
            words[i] = sc.next();
        }

        System.out.println(" The words in the Array is : " + Arrays.toString(words));

        Map<String,List<String>> hm = new HashMap<>();

        for (String word : words)
        {
            char[] ch = word.toCharArray();

            Arrays.sort(ch);

            String sortedWords = new String(ch);

            if (!hm.containsKey(sortedWords))
            {
                hm.put(sortedWords, new ArrayList<>());
            }

            else
            {
                hm.put(sortedWords,hm.get(word));
            }
        }

        System.out.println("Grouped Anagrams ");

        for (List<String> list : hm.values())
        {
            System.out.println(list);
        }
    }
}
