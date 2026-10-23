import java.util.*;

public class move_zeros_end {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");

        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("the elements are :" + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("The sorted array is : " + Arrays.toString(array));

        int index = 0;

        for(int i=0; i<array.length; i++)
        {
            if(array[i] != 0)
            {
                int temp = array[i];

                array[i] = array[index];

                array[index] = temp;

                index++;
            }
        }

        System.out.println("The order of non-zero elements are : " + Arrays.toString(array));
    }
}
