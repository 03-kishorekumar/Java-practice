package ArrayList_Programs;

import java.util.*;

public class HighestFrequencyElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 3, 4, 5, 5, 67); // immutable
        Integer sec = list.stream().
                sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
                .orElse(0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The Elements are : " + Arrays.toString(array));

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

        System.out.println("The Elements in the set are : " + hm);

        int maxFrequency = 0;

        int maxElement = 0;

        for (Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > maxFrequency)
            {
                maxFrequency = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Highest Frequency Element : " + maxElement);

        System.out.println("Highest Frequency : " + maxFrequency);

    }
}
