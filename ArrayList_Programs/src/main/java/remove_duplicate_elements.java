package ArrayList_Programs;

import java.util.*;

public class remove_duplicate_elements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");

        list.add("Blue");

        list.add("Pink");

        list.add("Yellow");

        System.out.println(list);

        list.add("Red");

        list.add("Pink");

        System.out.println(list);

        ArrayList<String> uniquecolor = new ArrayList<>();

        for (String color : list) {
            
            if (!uniquecolor.contains(color)) {

                uniquecolor.add(color);
            
            }
        }

        System.out.println(uniquecolor);

    }
}
