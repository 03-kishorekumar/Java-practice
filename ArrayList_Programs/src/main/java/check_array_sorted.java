
import java.util.*;

public class check_array_sorted {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array :");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println(" The elements are : " + Arrays.toString(array));

        boolean isSorted = true;

        for(int i=0; i<array.length-1; i++)
        {
            if(array[i]>array[i+1])
            {
                isSorted = false;
                break;
            }
        }

        if(isSorted)
        {
            System.out.println(" Array is Sorted");
        }
        else
        {
            System.out.println(" Array is not Sorted");
        }
    }
}
