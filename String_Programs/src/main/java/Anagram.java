
import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String 1 : ");

        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the String 2 : ");

        String str2 = sc.nextLine().toLowerCase();

        if(str1.length() != str2.length())
        {
            System.out.println("Not an Anagram");
            return;
        }

        Map<Character,Integer> hm = new HashMap<>();

        for (char ch : str1.toCharArray())
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

        for (char ch : str2.toCharArray())
        {
            if(!hm.containsKey(ch))
            {
                System.out.println("Not an Anagram");

                return;
            }

            hm.put(ch,hm.get(ch)-1);

            if(hm.get(ch) == 0)
            {
                hm.remove(ch);
            }
        }

        if(hm.isEmpty())
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }

//        char[] ch1 = str1.toCharArray();
//
//        char[] ch2 = str2.toCharArray();
//
//        Arrays.sort(ch1);
//
//        Arrays.sort(ch2);
//
//        if(Arrays.equals(ch1,ch2))
//        {
//            System.out.println("Anagram");
//        }
//        else {
//            System.out.println("Not an Anagram");
//        }
    }
}
