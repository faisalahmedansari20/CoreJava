import java.util.*;
public class JavaHungry
{
    
    public static void main(String[] args)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);

        Iterator iteratorobject = hashmap.keySet().iterator(); 
        while(iteratorobject.hasNext()){
              String hashmapkey = iteratorobject.next(); 
              System.out.print(hashmap.get(hashmapkey));
        } 
    }
}