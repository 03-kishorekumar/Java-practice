package ArrayList_Programs;

import java.util.*;

public class lambda_expr_filter_color {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("yellow");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");

        System.out.println("Original list: " + list);

        String substring = "e";

        List<String> filteredList = new ArrayList<>();

        list.forEach(color -> {                             // Lambda expression without using stream concept
            if(color.contains(substring))
            {
                filteredList.add(color);
            }
        });

        System.out.println("Filtered list: " + filteredList);
    }
    
}
