package ArrayList_Programs;

import java.util.*;

public class reverse_array {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the array : ");

        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("the elements are :" + array);

        for(int i=0;i<array.length/2;i++)
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("the Reversed elements are :" + Arrays.toString(array));

    }
}
