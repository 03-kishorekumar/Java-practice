package ArrayList_Programs;

import java.util.*;

public class TwoSumLoop {

    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        System.out.println("Enter the Elements for the array : ");

        int[] array = new int[size];

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array));

        System.out.println("Enter the Target value for the Two sum of the numbers in an array : ");

        int target = sc.nextInt();

        for (int i=0; i< array.length;i++)
        {
            for (int j=i+1; j< array.length; j++)
            {
                if(array[i] + array[j] == target)
                {
                    System.out.print("Indexes : [ " + i + " , " + j + " ] ");
                    return;
                }
            }
        }
        System.out.println("No Pair Found");
    }
}
