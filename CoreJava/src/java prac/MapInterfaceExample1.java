import java.util.*;  
class MapInterfaceExample1
	{  
 public static void main(String args[])
	 {  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");
  
  Set<Integer> s=map.keySet();
  Iterator itr=s.iterator();


//  while(itr.hasNext())
//		 {
//	       Integer i=(Integer)itr.next();
//		   System.out.println(i+" "+map.get(i));
//		 }

       



//  for(Map.Entry m:map.entrySet()){  
//   System.out.println(m.getKey()+" "+m.getValue());  
//  }  
 }  
} 