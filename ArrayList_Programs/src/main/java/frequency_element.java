
import java.util.*;

public class frequency_element {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array :");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println(" The Elements in an Array : " + Arrays.toString(array));

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : array)
        {
            if(hm.containsKey(num))
            {
                hm.put(num,hm.get(num)+1);
            }
            else
            {
                hm.put(num,1);
            }
        }

        System.out.println(" Key and values of the map : " + hm );

        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
