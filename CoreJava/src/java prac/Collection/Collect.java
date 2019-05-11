/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
//		List<Integer> ls=new ArrayList<>();
		Set<Integer> ls=new HashSet<>();
//		Map<Integer,String> ls=new HashMap<>();
       
//	   		System.out.println(ls.put(10,"abc"));
//	   		System.out.println(ls.put(10,"mnk"));
//            System.out.println(ls);



		System.out.println(ls.add(10));
		System.out.println(ls.add(10));
	}
}
*/






/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Collect {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

	}
}
*/



/*
@FunctionalInterface
 interface Interface1 {

	void method1(String str,Integer i);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
}

@FunctionalInterface
 interface Interface2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}

 public class Collect implements Interface1, Interface2 
	 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str,Integer i) {
//     System.out.println(str+" "+i);
	}

	//Collect won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("Collect logging::"+str);
		Interface1.print("abc");
	}

          public static void main(String[] args)
		 {
//            Collect obj=new Collect();
//			obj.log("hi");
		 
		 Interface1 i1 = (s,i) -> 
			 {
			 
//			 s=s+" malik";
			  System.out.println(s+" "+i);
		     };
         i1.method1("abc",20);
		 
//		    Runnable r = new Runnable(){
//			@Override
//			public void run() {
//				System.out.println("My Runnable");
//			}};
//            Thread t=new Thread(r);
//			t.start();

//             Runnable r1 = () -> 
//			 {
//			       System.out.println("My Runnable");
//			 };   
//				 Thread t=new Thread(r1);
//				 t.start();
		 }
	 }
*/




/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Collect 
 {
	  public static void main(String[] args) 
		{
		
		    //creating sample Collection
		    List<Integer> myList = new ArrayList<Integer>();
		    for(int i=0; i<3; i++) myList.add(i);
		    
		    //traversing using Iterator
		    Iterator<Integer> it = myList.iterator();
		    while(it.hasNext())
		    	{
		    	Integer i = it.next();
//		    	System.out.println("Iterator Value::"+i);
		        }
		    
		    //traversing through forEach method of Iterable with anonymous class
		    myList.forEach
		    	(
		    	    new Consumer<Integer>() 
		    	    {
		            	public void accept(Integer t) 
		    	    	{
		    	        	System.out.println("forEach anonymous class Value::"+t);
		    	        }
		            }
		       );
		    
		    //traversing with Consumer interface implementation
		    MyConsumer action = new MyConsumer();
		    myList.forEach(action);
	   }
  }
	
//Consumer implementation that can be reused
    class MyConsumer implements Consumer<Integer>
	{

	    public void accept(Integer t)
		  {
		  System.out.println("Consumer impl Value::"+t);
	      }
    }
*/

/*
class Collect implements Runnable
{
	public static void main(String[] args)
	{
		Collect o=()->System.out.println("hi");
		 Thread t=new Thread(o);

		t.start();

	}
}
*/



/*
import java.util.*;
import java.util.stream.*;

class Collect
{
	    private static int sumStream(List<Integer> list) 
		{
        	return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		}
	public static void main(String[] args)
	{
		List<Integer> ls=new ArrayList<>();

		ls.add(100);
		ls.add(101);
		ls.add(102);

      System.out.println(sumStream(ls));
	}
}
*/





/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		List<Integer> ls=new ArrayList<>();

		ls.add(1003);
		ls.add(1002);
		ls.add(1001);

		Iterator itr=ls.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
*/



/*
import java.util.*;

class Collect
{
      public static void main(String[] args)
	{ 
     	  Object[] obj=new Object[3];
		  List<Double> doubleList = new ArrayList<Double>();
          doubleList.add(Double.valueOf(1.23));
          obj[0] = doubleList;

		  System.out.println(obj);


	}
}

*/



/*
import java.util.*;

// Thread with Collection values and entrySet
class Collect extends Thread
{
	  static Map<String,Integer> mp=new HashMap<>();


       public static void mk()
	   {
		   try
		   {
			Thread.sleep(1000);
		   }
		   catch (Exception e)
		   {
		   }
		   System.out.println(mp.values());
	   }


     public void run()
	  {
	    mk();
	  }

    public static void main(String[] args)
	{
	   mp.put("A",100);
       mp.put("B",101);
       mp.put("C",102);
       mp.put("D",103);

		Collect t=new Collect();
		t.start();

         Set s=mp.entrySet();
	     Iterator itr=s.iterator();

		 while(itr.hasNext())
		{
			 Map.Entry m=(Map.Entry)itr.next();

			 System.out.println(m.getValue());
			 itr.remove();
     		try
     		{
     		 Thread.sleep(2000);
     		}
     		catch (Exception e)
     		{
     		}
			
		}
	}
}
*/



/*
import java.util.*;

class Collect
{  
	public static void main(String[] args)
	{
		Mkey o=new Mkey("abc");
		Mkey o1=new Mkey("abc");
 
//        String s1="abc";
//        String s2="abc";
       
	      String s3=new String("xyz");
	      String s4=new String("xyz");
 

          System.out.println(s4.hashCode());

//          System.out.println(s1.hashCode()+" "+s2.hashCode());
//        System.out.println(o.hashCode()+" "+o1.hashCode());

//	    System.out.println(o);
	    
//		Map<Mkey,String> mp=new HashMap<>();
		Map<String,Integer> mp=new HashMap<>();

//		o.setName("mln");
//	    System.out.println(o);

		mp.put("malik",100);
        mp.put("wakeel",101);

		System.out.println(mp.entrySet());

//	    System.out.println(mp.get(s3));
//	    System.out.println(mp.get(s4));

//		System.out.println(mp.get(new Mkey("abc")));
	}
}

class Mkey
{
	String name;

    public String toString()
	{
		return name;
	}

	Mkey(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
*/



/*
class Gen<T>
{
	T obj;
	Gen(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println(obj.getClass().getName());
	}
	public T getObj()
	{
		return obj;
	}
}

  class Collect
  {
	  public static void main(String[] args)
	  {
		  Gen<String> g1=new Gen<>("MW");
		  g1.show();
		  System.out.println(g1.getObj());
	  }
  }
*/


/*
import java.util.*;

class Temp
{
   int i;
   Temp(int i)
	{
	   this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i%16+"";
	}
}


class Collect
{ 
	public static void main(String[] args)
	{
		Hashtable<Temp,String> mp=new Hashtable<>(16);

		mp.put(new Temp(16),"A");
		mp.put(new Temp(17),"B");
		mp.put(new Temp(18),"C");

       System.out.println(mp);
	}

}
*/



/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		List<Integer> ls=new ArrayList<>();

		ls.add(10);
		ls.add(20);
		ls.add(10);
		System.out.println(ls);

		Collections.sort(ls,new Sort());
		System.out.println(ls);
	}
}

class Sort implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;

       if(i1<i2)
		{
		   return 1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else 
			return 0;
	}
}
*/







/*
import java.util.*;  

class Collect
	{  
       public static void main(String args[])
	   {  
//         HashMap<Integer,String> hm=new HashMap<Integer,String>();  
       HashMap hm=new HashMap();  

         hm.put(100,"Amit");  
         hm.put(101,"Vijay");  
         hm.put(102,"Rahul");  
        
//		Set s=hm.keySet();
        Set s=hm.entrySet();
//		Iterator itr=s.iterator();
//		for(Map.Entry m:hm.entrySet())
        for(Object m: s)
//            while(itr.hasNext())
			{ 
//				Integer i=(Integer)itr.next();
//              Map.Entry m=(Map.Entry)itr.next();
               Map.Entry mm=(Map.Entry)m;
               System.out.println(mm.getKey()+" "+mm.getValue());
//                System.out.println(m+" "+hm.get(m));  
            }  
       }  
    }

*/




/*
import java.util.*;  
public class Collect
	{  
 public static void main(String args[])
	 {  
        LinkedList<String> al=new LinkedList<String>();  
//        LinkedList al=new LinkedList();  

        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        
//        Iterator<String> itr=al.iterator();  
        
//           while(itr.hasNext())
              for(Object s: al)
      	  { 
				System.out.println(s);  
//            System.out.println(itr.next());  
          }  
      }  
}
/*


/*
import java.util.concurrent.*;

class Collect
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer,String> mp=new ConcurrentHashMap<>();
		
			mp.put(1,"A");
			mp.putIfAbsent(2,"a");
			System.out.println(mp);

			mp.remove(1,"A");
			System.out.println(mp);

	}
}
*/



/*
import java.util.*;

class Collect extends Thread
{ 
	 static List<String> ls=new ArrayList<>();
	 
	 public void run()
	{
		 try
		 {
			Thread.sleep(2000);
		 }
		 catch (InterruptedException ir)
		 {
		 }
		 System.out.println(Thread.currentThread().getName()+" executing the ls");
		 ls.add("E");
	}

	 public static void main(String[] args)
	{
		 ls.add("A");
		 ls.add("B");

		 Collect t=new Collect();
		 t.start();

		 Iterator itr=ls.iterator();
		 while(itr.hasNext())
		{
			 String s=(String)itr.next();
			 System.out.println("the main thread executing "+s);
	        try
	        {
		       Thread.sleep(3000);
	        }
	        catch (Exception e)
	        {
	        }
		}

	}

}
*/





  



/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();

		ls.add("D");
		ls.add("A");
		ls.add("B");
		ls.add("C");

		System.out.println(ls);
        Collections.sort(ls,new MyComparators1());
		System.out.println(ls);
	
//	    Collections.sort(ls,new MyComparators1());
//		System.out.println(ls);

//		System.out.println(Collections.binarySearch(ls,"E",new MyComparators1()));
	}
 }
 
 
 class MyComparators1 implements Comparator
  {
	  public int compare(Object obj1,Object obj2)
	  {
		  String s1=(String)obj1;
		  String s2=(String)obj2;

		 return s2.compareTo(s1);
	  }
  } 



 
 
 */





/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		Set<Integer> s=new TreeSet<>();

		s.add(10);
		s.add(30);
		s.add(9);
		System.out.println(s);
      
//	    int x=s.cieling(9);
//	    System.out.println(x);
	
	}
}
*/



/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		TreeSet<Integer> s=new TreeSet<>();

          s.add(10);
          s.add(50);
          s.add(30);

           System.out.println(s.floor(29));
//         System.out.println(s);
	}
//}
*/

/*
import java.util.*;
class Temp
{
	String name;
	int i;
	 
	 Temp(int i,String name)
	{
		 this.name=name;
		 this.i=i;
	}
//     public String toString()
//	{
//		 return name+" "+i;
//	}
//	public int hashCode()
//	{
//		return i;
//	}
}

  class Collect
  {
	  public static void main(String[] args)
	  {
		  Temp t1=new Temp(10,"malik");
		  Temp t2=new Temp(20,"Ahmed");
          Temp t3=new Temp(30,"Mw");
          Temp t4=new Temp(109,"ee");
          Temp t5=new Temp(21,"mm");

           System.out.println("t1="+t1.hashCode()%11+" t2="+t2.hashCode()%11+" t3="+t3.hashCode()%11+" t4="+t4.hashCode()%11+" t5="+t5.hashCode()%	11);

		  Hashtable<Temp,String> hs=new Hashtable<>();
		  hs.put(t1,"A");
 		  hs.put(t2,"B");
		  hs.put(t3,"C");
		  hs.put(t4,"E");
		  hs.put(t5,"D");


        System.out.println(hs);
	  }
  }
*/   






/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		TreeMap mp=new TreeMap();

		mp.put(10,"B");
		mp.put(A,"C");
		System.out.println(mp);
	}
}
*/





/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		Map mp=new HashMap();

		mp.put(2,"A");
		mp.put(1,"B");
    
//	   System.out.println(mp.put(1,"F"));
   
       Set ss=mp.entrySet();
	   Iterator itr=ss.iterator();
	   while(itr.hasNext())
		{
		   Map.Entry mt=(Map.Entry)itr.next();
		   System.out.println(mt.getKey()+" "+mt.getValue());
		}
//	   System.out.println(ss);


//	    Set s=mp.keySet();
//		System.out.println(s);
//       Collection c=mp.values();
//	   System.out.println(c);

//	    Set s=mp.entrySet();
//		Iterator itr=s.iterator();

//		while(itr.hasNext())
//		{
//			Map.Entry e=(Map.Entry)itr.next();
////			System.out.println(e.getKey()+" "+e.getValue());
//		}
	}
}

*/


/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		Map<Integer,String> mp=new HashMap<>();

		mp.put(2,"A");
		mp.put(1,"B");
//		mp.put(1,"F");	
//	   System.out.println(mp);
    
	    for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
/*

/*
import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		Map<Integer,String> mp=new HashMap<>();

		mp.put(1,"A");
		mp.put(2,"B");
//		mp.put(1,"F");	
		System.out.println(mp);
    }
}
/*







/*
import java.util.*;

class Collect
{
      public static void main(String[] args)
	{
	TreeSet<Integer> tr=new TreeSet<>(new MyComparator());

         tr.add(10);
		 tr.add(0);
         tr.add(9);
		 tr.add(8);
		 System.out.println(tr);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	    Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
 
//        return i1.compareTo(i2);
//        return -i1.compareTo(i2);
//        return i2.compareTo(i1);
//        return -i1.compareTo(i2);
//        return -i2.compareTo(i1);
//        return 0;

//         int x=0;
//         int y=0;
//		if(i1<i2)
//		{
//			x++;
//			System.out.println(x+" is x i1="+i1+" and i2="+i2);
//		  return -1;
//		}
//		else if(i1>i2) 
//		{
//			y++;
//		    System.out.println(y+" is y i1="+i1+" and i2="+i2);
//			return 1;
//		}
//		else 
//			return 0;
	}
}
*/


/*
import java.util.*;

class  Collect
{
	
	
	public static void main(String[] args)
	{
        Stack s=new Stack();
		s.push("A");
		s.push("C");	
		s.push("B");

          System.out.println(s.search("A"));
//        System.out.println(s.pop());

	  for(Object ss:s)
		{
		  String str=(String)ss;
//		  System.out.println(str);
		}
	}

}
/*







/*
import java.util.*;

class  Collect
{
	
	
	public static void main(String[] args)
	{
    
	    List<String> ls1=new LinkedList<>();
  		ls1.add("A");
 		ls1.add("E");
 		ls1.add("D");
	

	    List<String> ls=new LinkedList<>();
		ls.add("A");
		ls.add("C");	
		ls.add("B");


//        System.out.println(ls1.apacity());
//		System.out.println(ls.get(0));
//		System.out.println(ls.getFirst());
//        ls.addLast("dwd");
//      ls.addFirst("Element");      

	  for(String s:ls)
		{
//		  System.out.println(s);
		}
	}

}
*/










/*
import java.util.*;

class  Collect
{
	
	
	public static void main(String[] args)
	{
    
	    List<String> ls1=new ArrayList<>();
  		System.out.println(ls1.add("A"));
 		ls1.add("E");
 		ls1.add("D");
	

		List<String> ls=new ArrayList<>();
		ls.add("A");
		ls.add("C");
		ls.add("B");
//		ls.add(0,"A");

//           ls.set(0,"P");
//         System.out.println(ls.get(2)); 
//        System.out.println(ls.lastIndexOf("A")); 
//       ls.remove(0); 
       ls.retainAll(ls1);
//		System.out.println(ls.size());
//		System.out.println(ls.containsAll(ls1));
//		System.out.println(ls.contains("A"));
//		ls.removeAll(ls1);
//		ls.addAll(1,ls1);
//        ls.remove("A");
      for(String s:ls)
		{
		  System.out.println(s);
		}
	}

}
*/