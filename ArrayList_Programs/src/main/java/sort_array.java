package ArrayList_Programs;

import java.util.*;

public class sort_array {

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

//        Arrays.sort(array);

//        System.out.println("The sorted array is : " + Arrays.toString(array));

        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1; j< array.length-1-i;j++)
            {
                if (array[i] > array[j + 1])
                {
                    int temp = array[i];

                    array[i] = array[j + 1];

                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted Array is : " + Arrays.toString(array));
    }
}
