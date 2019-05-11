import java.util.*;

 class Checkcollection
 { 
  public static void main(String[] args)
  {
   Map<String,Integer> mp=new HashMap<>();

     mp.put("A",1);
	 mp.put("D",1);
	 mp.put("B",2);
	 mp.put("C",3);

	// Iterator itr=mp.keySet().iterator();

      for(Map.Entry m:mp.entrySet())
	  {
        System.out.println(m.getKey()+" "+m.getValue());
	  }
  }
 }
    
