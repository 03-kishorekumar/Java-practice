

import java.util.*;

public class AllPairSum {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements for the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array));

        System.out.println("Enter the target value : ");

        int target = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        for(int num : array)
        {
            int difference = target - num;

            if(hs.contains(difference))
            {
                System.out.println("Pair : " + difference + ", " + num);
            }

            hs.add(num);
        }

    }


}
