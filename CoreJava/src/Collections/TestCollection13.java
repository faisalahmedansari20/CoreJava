import java.util.*;  
class TestCollection13
	{  
 public static void main(String args[])
	 {  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  for(Map.Entry<Integer,String> m:hm.entrySet())
	  {
	  int i=m.getKey();
	  String s=m.getValue();
   System.out.println(i+" "+s);  
  }  
 }  
}  