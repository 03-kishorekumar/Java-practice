package ArrayList_Programs;

import java.util.*;

public class left_right_rotate {

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

//        int first = array[0];
//
//        for(int i=0; i< array.length-1; i++)
//        {
//            array[i] = array[i+1];
//        }
//
//        array[array.length-1] = first;
//
//        System.out.println("Left rotate of the array : " + Arrays.toString(array));

        int last = array[array.length-1];

        for (int i = array.length-1; i>0; i--)
        {
            array[i] = array[i-1];
        }

        array[0] = last;

        System.out.println("Right rotate of the array : " + Arrays.toString(array));
    }
}
