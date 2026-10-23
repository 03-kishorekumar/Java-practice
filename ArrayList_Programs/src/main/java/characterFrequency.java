import java.util.*;

public class characterFrequency {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word to find the frequency of each character : ");

        String word = sc.nextLine();

        Map<Character,Integer> hm = new HashMap<>();

        for(char ch : word.toCharArray())
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

        System.out.println(" Total frequency for all characters in the word : ");

//        for(Map.Entry<Character,Integer> entry : hm.entrySet())
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        char maxCharacter = 0;

        int maxFrequency = 0;

        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>maxFrequency)
            {
                maxFrequency = entry.getValue();
                maxCharacter = entry.getKey();
            }
        }

        System.out.println("Highest Frequency character : " + maxCharacter);

        System.out.println("Highest Frequency : " + maxFrequency);

    }
}
