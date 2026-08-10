package ArrayList_Programs;

import java.util.Scanner;

public class lowest_age_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size" );

        int size =  sc.nextInt();

        int[] age = new int[size];

        for(int i=0;i<size;i++)
        {
            age[i] = sc.nextInt();
        }

        System.out.println("the ages are :" + age);

        int lowest_age = age[0];

        for(int i=0;i<age.length;i++)
        {
            if(lowest_age > age[i])
            {
                lowest_age = age[i];
            }
        }

        System.out.println(lowest_age);

    }

}
