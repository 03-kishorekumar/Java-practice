
import java.util.*;


public class Words_Frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the sentence to find the frequency of words : ");

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("The words in the sentence are : " + Arrays.toString(words));

        Map<String, Integer> hm = new HashMap<>();

        for(String word : words)
        {
            if(hm.containsKey(word))
            {
                hm.put(word, hm.get(word) + 1);
            }
            else{
                hm.put(word, 1);
            }
        }

//        System.out.println(" Total frequency for all words in the sentence : ");
//
//        for(Map.Entry<String, Integer> entry : hm.entrySet())
//        {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        int max_frequency = 0;

        String max_frequency_word = "";

        for(Map.Entry<String, Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > max_frequency)
            {
                max_frequency = entry.getValue();
                max_frequency_word = entry.getKey();
            }
        }

        System.out.println(" Maximum frequency word : " + max_frequency_word + " : " + max_frequency);
    }
}