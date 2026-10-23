
import java.util.*;

public class second_smallest_array {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements are : " + Arrays.toString(array));

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : array)
        {
            if(num < first)
            {
                second = first;
                first = num;
            } else if (num < second && num != first ) {

                second = num;

            }
        }

        System.out.println("The Second smallest element is : " + second);

    }
}
