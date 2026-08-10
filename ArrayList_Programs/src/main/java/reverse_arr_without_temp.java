package ArrayList_Programs;

import java.util.*;

public class reverse_arr_without_temp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are :" + Arrays.toString(array));

        for(int i=0; i<array.length/2; i++)
        {
            array[i] = array[i] + array[array.length-1-i];

            array[array.length-1-i]  = array[i] - array[array.length-1-i];

            array[i] = array[i] - array[array.length-1-i];
        }

        System.out.println("The Reversed array is : " + Arrays.toString(array));
    }
}
