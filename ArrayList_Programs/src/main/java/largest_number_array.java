
import java.util.*;

public class largest_number_array {

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

        System.out.println(" The elements are : " + Arrays.toString(array));

        int max = array[0];

        for(int nums : array)
        {
            if(nums > max)
            {
                max = nums;
            }
        }

        System.out.println("The Largest element in an array is : " + max);

    }
}
