import java.util.*;

public class RepeatedWord {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence : ");

        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split(" ");

        System.out.println("The words in the sentence are : " + Arrays.toString(words));

        Map<String,Integer> hm = new HashMap<>();

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

        System.out.println("Repeated words are : ");

        System.out.println("All Repeated words are : ");

        boolean found = false;

        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + " ");
                found = true;
            }
        }

        if (!found)
        {
            System.out.println("No Repeated Words are Found");
        }

//        System.out.println("First Non-repeated word : ");
//
//        boolean found = false;
//
//        for(Map.Entry<String,Integer> entry : hm.entrySet())
//        {
//            if(entry.getValue()>1)
//            {
//                System.out.println(entry.getKey() + " ");
//                found = true;
//                break;
//            }
//        }
//
//        if (!found)
//        {
//            System.out.println("No Repeated Word Found");
//        }

    }
}
