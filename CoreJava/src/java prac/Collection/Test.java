import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Test
{
       List<People> people=Arrays.asList(
			                           new People("Jimy","Thomas",20),
			                           new People("SaLmi","sam",20),
                            		   new People("Ali","sammy",20)
		                             );
	    Stream<People> strm=people.stream();
	   strm.forEach(p -> System.out.println(p))	;
}

class People
{
	int age;
	String firstName;
    String lastName;

	People(String firstName,String lastName,int age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	public String getFirstName()
	{
		return firstName;
	}

	public String toString()
	{
		return name+".."+age;
	}
}



/*
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Test
	public static void main(String[] args)
	{ 
		List<People> ps=Arrays.asList(
			                           new People("Jimy",20),
			                           new People("SaLmi",20),
                            		   new People("Ali",20)
		                             );

		              call(ps, p ->true,System.out::println);

//            call( ps,p -> { 
//				             final int x=10; 
//							 if(x>8)
//								    { 
//								     return true;
//								    }
//			                               else
//											   {
//										         return false;
//										       }
//			             }                                   
//						                                     ,p ->
//							                                  { 
//				                                                int x=20;
//								                                int y=x+20;
//				                                                System.out.println(p+" "+y);
//				                                               }
//				);
	}
	public static void call(List<People> ps,Predicate<People> predicate,Consumer<People> consumer)
	{
		for(People p:ps)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
	}
}
class People
{
	int age;
	String name;

	People(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+".."+age;
	}
}
*/



/*
class Test
{
    public static void print()
	{
		System.out.println("hi");
	}

	public static void main(String[] args)
	{
//		Thread t=new Thread(()-> print());
        Thread t=new Thread(Test :: print);
		t.start();

	}
}
*/

/*
import java.util.*;
import java.util.stream.*;

public  class Test
{
	public static void mk(int i)
	{
		System.out.println(i*2);
	}

	public static void main(String[] args)
	{
		List<Integer> ls=Arrays.asList(1,4,5,7);

		     ls.stream().forEach(Test::mk);
//          ls.stream().forEach(i -> mk(i));
//        long l1=System.currentTimeMillis();
//        ls.stream().forEach(x ->System.out.println(x));
//		ls.stream().forEach(System.out::println);
//        long l2=System.currentTimeMillis();
//	    System.out.println(l2-l1);
	}
}
*/









/*
interface Interf
{
	public void mk();
}

class Test
{
	public static void m1()
	{
		Interf i=() -> System.out.println("in the System ");
		i.mk();
	}
	public static void main(String[] args)
	{
       Interf i1=Test ::m1;
         i1.mk();
	}
}

*/







/*
interface Test1
{
//      static 
//		  {
//		   System.out.println("in the static method of parent Test1 class");
//		  }

	public static void mk()
	{
		System.out.println("inside the static mk method");
	}
   
     public static void gk()
	{
		 System.out.println(" in the system");
	}

	public static void main(String[] args)
	{
//		System.out.println("hi");
          Test1.gk();
	}
}

class Test implements Test1
{
	static 
		  {
		   System.out.println("in the static method of child Test class");
		  }
	public static void main(String[] args)
	{
		Test1.mk();
//		Test1 t=new Test1();
	}
}
*/


/*
interface Interf
{
	public int square(int n);
}

class Test
{
	public static void main(String[] args)
	{
		Interf i=n ->n*n;
               //or
		//		{
//			return n*n;
//		};
		System.out.println(i.square(10));
		System.out.println(i.square(100));
	}

}
*/





/*
import java.util.function.*;

class Test
{
	public static void main(String[] args)
	{
		Supplier<String> ss=() -> {
			                        String[] str={"malik","Ahmed","Sami","Hello"};
									int s=(int)(Math.random()*3+1);
									System.out.println(s);
									return str[s];
		                          };
								  System.out.println(ss.get());
								  System.out.println(ss.get());
								  System.out.println(ss.get());
								  System.out.println(ss.get());

	}
}
*/

/*
import java.util.function.Consumer;

public class Test
{
	public static void main(String[] args)
	{
		Consumer<String> c=(s) ->System.out.println(s);
		c.accept("hi");
	}
}
*/

/*

interface Mk<T>
{
  public T m1(T t);
} 

class Test
{
	public static void main(String[] args)
	{
		Mk<String> str=(s) ->{
			System.out.println(s);
			return s;
		};
		System.out.println(str.m1("hi"));
	}
}
*/



/*
interface Predicate<T>
{
  boolean test(T t);
}

interface Function<T,R>
{
   R apply(T t)
}

interface Consumer<T>
{
	void apply(T t)
}
*/






/*
import java.util.*;
import java.util.stream.*;
class Test
{
	public static void main(String[] args)
	{
		List<Integer> ls=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			ls.add(i);
		}
		System.out.println(ls);
 
        List<Integer> l=ls.parallelStream().map(i-> i*2).collect(Collectors.toList());
		System.out.println(l);

//		List<Integer> l=ls.parallelStream().filter(i-> i%2==0).collect(Collectors.toList());
//		System.out.println(l);
	}
}
*/







/*
interface Left
{
	default void m1()
	{
		System.out.println("in the left");
	}
}

interface Right
{
	default void m2()
	{
		System.out.println("in the Right");
	}
}

 public class Test implements Left,Right
 {
	 public void m1()
	 {
//		 System.out.println(" in the main of the Main class m1 method");
         Left.super.m1();
	 }
	 public static void main(String[] args)
	 {
		  Test m=new Test();
		  m.m1();
	 }
 }
*/




/*
interface Interf
{
	public void m1(Test tt);
}

class Test
{

	public static void main(String[] args)
	{
       Interf i=(Obj) -> {
		                    System.out.println(Obj);
	                     };
           i.m1(new Test());
	}
}
*/


/*
interface Interf
{
	public void m1(Test tt);
}

class Test
{
	int x=10;

	public void m2()
	{
		int y=20;
        
		Interf i=(Test)->{
						System.out.println(Test);
		             };
			i.m1(new Test());
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m2();
	}
}
*/