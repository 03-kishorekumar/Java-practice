import java.util.*;

public class Arraylist {

public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<>();
    
    list.add("Apple");
    
    list.add("Banana");
    
    list.add("Orange");
    
    list.add("Pineapple");
    
    System.out.println(list);
    
    Iterator itr = list.iterator();
    
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
    
  }
    
}
