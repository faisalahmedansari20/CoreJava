import java.util.*;  

class MapInterfaceExample
	{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul"); 
  
  Set set=map.entrySet();
  Iterator itr=set.iterator();
  while(itr.hasNext())
	  {
	  Map.Entry m=(Map.Entry)itr.next();
       

       System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  