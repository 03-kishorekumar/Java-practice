
import java.util.*;

public class second_largest_array {

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

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : array)
        {
            if(num > first)
            {
                second = first;

                first = num;
            }

            else if (num < second && num!=first)
            {
                second = num;
            }
        }

        System.out.println("The second element is : " + second);


    }
}
