
import java.util.*;

public class rotate_n_position {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println(" Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements are : " + Arrays.toString(array));

//        int[] result = new int[array.length];
//
//        System.out.println("Enter the number to rotate an array : ");
//
//        int n = sc.nextInt();
//
//        for(int i=0; i<array.length; i++)
//        {
//            int index = (i + n) % array.length;
//
//            result[index] = array[i];
//        }
//
//        System.out.println("After Left rotating the array : " + Arrays.toString(result));

        System.out.println("Enter the index of the element to be rotated : ");

        int index = sc.nextInt() % array.length;

        int[] result = new int[array.length];

        for(int i=0; i<array.length; i++)
        {
            int new_index = (i - index + array.length) % array.length;

            result[new_index] = array[i];
        }

        System.out.println("After Right rotating the array : " + Arrays.toString(result));

    }
}
