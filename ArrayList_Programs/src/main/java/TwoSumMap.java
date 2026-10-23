import java.util.*;

public class TwoSumMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array));

        System.out.println("Enter the target value : ");

        int target = sc.nextInt();

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<array.length; i++)
        {
            int difference = target - array[i];

            if(hm.containsKey(difference))
            {
                System.out.println("Indexes : [ " + hm.get(difference) + " , " + i + " ]");

                return;
            }

            hm.put(array[i],i );
        }

        System.out.println("No Pair Found");

    }
}
