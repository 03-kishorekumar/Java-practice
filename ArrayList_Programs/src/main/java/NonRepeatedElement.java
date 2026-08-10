package ArrayList_Programs;

import java.util.*;

public class NonRepeatedElement {

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

//        System.out.println("All Non-repeated Elements are : ");
//
//        boolean found = false;
//
//        for(int num : array)
//        {
//            if(hm.get(num) == 1)
//            {
//                System.out.print(num + " ");
//                found = true;
//            }
//        }
//
//        if(!found)
//        {
//            System.out.println("No non-repeated element found");
//        }

        System.out.println("First Non-repeated Elements are : ");

        boolean found = false;

        for(int num : array)
        {
            if(hm.get(num) == 1)
            {
                System.out.print(num + " ");
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("No non-repeated element found");
        }
    }
}
