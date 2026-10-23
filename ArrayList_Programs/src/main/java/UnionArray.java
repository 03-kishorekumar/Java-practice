
import java.util.*;

public class UnionArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Size for the 1st array : ");

        int size1 = sc.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter the elements for the 1st array : ");

        for(int i=0; i<size1; i++)
        {
            array1[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array1));

        System.out.println(" Enter the Size for the 2nd array : ");

        int size2 = sc.nextInt();

        int[] array2 = new int[size1];

        System.out.println("Enter the elements for the 2nd array : ");

        for(int i=0; i<size2; i++)
        {
            array2[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array2));

        Set<Integer> hs = new HashSet<>();

        for(int num : array1)
        {
            hs.add(num);
        }

        for(int num : array2)
        {
            hs.add(num);
        }

        System.out.println("Union Array : " + hs);
    }
}
