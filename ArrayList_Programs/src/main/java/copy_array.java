
import java.util.*;

public class copy_array {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array :");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println(" The Original Array : " + Arrays.toString(array));

//        int[] copy_array = new int[array.length];
//
//        for(int i=0; i< array.length; i++)
//        {
//            copy_array[i] = array[i];
//        }
//
//        System.out.println("The Copied Array is : " + Arrays.toString(copy_array));

//        int[] copy_array = Arrays.copyOf(array,array.length);
//
//        System.out.println("The Copied Array is : " + Arrays.toString(copy_array));

        int[] copy_array = array.clone();

        System.out.println("The Copied Array is : " + Arrays.toString(copy_array));

    }
}
