package ArrayList_Programs;

import java.util.*;

public class missing_number {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        System.out.println("Enter the elements of the array : ");

        int[] array = new int[size];

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements are : " + Arrays.toString(array));

        int n = size+1;

        int expected_sum = n * (n + 1) / 2;

        int actual_sum = 0;

        for(int num : array)
        {
            actual_sum += num;
        }

        int missing_number = expected_sum - actual_sum;

        System.out.println("The missing number is : " + missing_number);

        sc.close();
    }
}
