
import java.util.*;

public class sortin_rev_alpha_order {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("yellow");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");

        System.out.println("Original list: " + list);

        // Collections.sort(list);

        // Collections.reverse(list);

        // System.out.println("Sorted list : " + list);

        // for(int i = list.size() - 1; i>=0; i--)
        // {
        //     System.out.println(list.get((i)));
        // }

        // -------------- WITHOUT USING INBUILT METHODS -----------------
        
        for(int i=0; i<list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j)) < 0)
                {
                    String temp = list.get(i);

                    System.out.println(temp);

                    list.set(i, list.get(j));

                    list.set(j, temp);
                }
            }
        }

        System.out.println("Reveresed list : " + list);

    }

}
