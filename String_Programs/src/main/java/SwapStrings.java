
import java.util.*;

public class SwapStrings {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value of string 1 : ");
//
//        String str1 = sc.nextLine();
//
//        System.out.println("Enter the value of string 2 : ");
//
//        String str2 = sc.nextLine();
//
//        str1 = str1 + str2;
//
//        str2 = str1.substring(0,str1.length() - str2.length());
//
//        str1 = str1.substring(str2.length());
//
//        System.out.println("The string after swap is : "+str1 + str2);

//        System.out.println("Enter the sentence to reverse it : ");
//
//        String sentence = sc.nextLine();
//
//        String[] words = sentence.split(" ");
//
//        for(int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }

        System.out.println("Reversing the each word in sentence : ");

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.print(sb + " ");
        }

    }
}
