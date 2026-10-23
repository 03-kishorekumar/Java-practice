
import java.util.*;

public class remove_duplicate {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println(" Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements are : " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("The sorted elements are : " + Arrays.toString(array));

        System.out.println("The Duplicate elements in the array are : ");

        for(int i=0; i< array.length-1; i++)
        {
            if(array[i] == array[i+1])
            {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("");

        Set<Integer> hs = new HashSet<>();

        for(int num : array)
        {
            hs.add(num);
        }

        System.out.println("After removing the duplicates from the array : " + hs);

//        System.out.println(" After removing the duplicates from the array : ");
//
//        for(int i=0; i<array.length - 1; i++)
//        {
//            if(array[i] != array[i+1])
//            {
//                System.out.print(array[i] + " ");
//            }
//        }
//
//        System.out.print(array[(array.length - 1)]);

    }
}
