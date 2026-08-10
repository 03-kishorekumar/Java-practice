

import java.util.*;

public class NonRepeatedWord {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence : ");

        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split(" ");

        System.out.println("The words in the sentence are : " + Arrays.toString(words));

        Map<String, Integer> hm = new HashMap<>();

        for (String word : words)
        {
            if(hm.containsKey(word))
            {
                hm.put(word,hm.get(word)+1);
            }
            else
            {
                hm.put(word,1);
            }
        }

        System.out.println("All Non-repeated words are : ");

        boolean found = false;

        for(String word : words)
        {
            if(hm.get(word)==1)
            {
                System.out.println(word + " ");
                found = true;
            }
        }

        if (!found)
        {
            System.out.println("No Non-Repeated Word Found");
        }

//        System.out.println("First Non-repeated word : ");
//
//        boolean found = false;
//
//        for(String word : words)
//        {
//            if(hm.get(word)==1)
//            {
//                System.out.println(word + " ");
//                found = true;
//                break;
//            }
//        }
//
//        if (!found)
//        {
//            System.out.println("No Non-Repeated Word Found");
//        }

    }

}
