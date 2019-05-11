import java.util.*;

class Collec
{
 public static void main(String[] args)
 {
  Map<Integer,String> mp=new HashMap<>();

   mp.put(65,"A");
   mp.put(66,"B");
   mp.put(67,"C");
   mp.put(68,"D");

     Iterator<Integer> itr=mp.keySet().iterator();

     mp.forEach((key, value)-> System.out.println(key + " -> " + value));


     for(int key:mp.keySet())
     {
		 String value=mp.get(key);
		 System.out.println(key+" "+value);
	 }


//   while(itr.hasNext())
//   {
//    int key=(int)itr.next();
//    String str=mp.get(key);
//    System.out.println(key+" "+str);
//    }
    }
}