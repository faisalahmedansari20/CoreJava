import java.io.*;
import java.util.*;

 public class Sort
 {
  public static void main(String[] arga)
  {
   List<String> ls=new ArrayList<>();

    ls.add("C");
    ls.add("B");
    ls.add("A");

//    Collections.sort(ls);

    Iterator itr=ls.iterator();

    while(itr.hasNext())
    {
     System.out.println(itr.next());
     }
     }
}