package ArrayList_Programs;

import java.util.*;

public class sum_average_array {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are :" + Arrays.toString(array));

        int sum = 0;

        for(int nums : array)
        {
            sum = sum + nums;
        }

        System.out.println("The sum of the Array is : " + sum);

        double average = sum/size;

        System.out.println("The average of the Array is : " + average);
    }
}
