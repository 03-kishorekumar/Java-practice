package ArrayList_Programs;

import java.util.*;

public class RepeatedElement {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array));

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : array)
        {
            if(hm.containsKey(num))
            {
                hm.put(num,hm.get(num)+1);
            }
            else
            {
                hm.put(num,1);
            }
        }

        System.out.println("All repeated Elements are : ");

        boolean found = false;

        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("No repeated element found");
        }

//        System.out.println("First repeated Elements are : ");
//
//        boolean found = false;
//
//        for(int num : array)
//        {
//            if(hm.get(num) > 1)
//            {
//                System.out.print(num + " ");
//                found = true;
//                break;
//            }
//        }
//
//        if(!found)
//        {
//            System.out.println("No repeated element found");
//        }
    }
}
