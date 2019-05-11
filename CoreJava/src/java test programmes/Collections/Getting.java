import java.util.*;
 public class Getting
 {
  public static void main(String[] args)
  {
   Map<String,Integer> mp=new HashMap<>();

    mp.put(" java",1);
    mp.put(" linux",2);
    mp.put(" Net",3);

//    Iterator itr=mp.keySet().iterator();


  //  while(itr.hasNext())
      for(Map.Entry m:mp.entrySet())
	{

      System.out.print(" "+m.getKey());
//	  System.out.println();
      System.out.print(" "+m.getValue()); 
//     Getting hashmapkey=(Getting)itr.next();
  //   int key=hashmapkey.getKey();
	// System.out.println(key);
     }
  }
 }
