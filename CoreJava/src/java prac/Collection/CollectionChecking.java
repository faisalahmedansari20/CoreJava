import java.util.*;

class CollectionChecking
{
	static List<Mem> ls=new ArrayList<>();

	public static void main(String[] args)
	{
		ls.add(new Mem("A",4));
		ls.add(new Mem("C",5));
		ls.add(new Mem("B",1));
		ls.add(new Mem("E",2));

         Collections.sort(ls);
         System.out.println(ls);
//       System.out.println(ls);
	}
}

class Mem  implements Comparable<Mem>
{
	String name;
	int age;
	static int x,y;

	Mem(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
       public String toString()
	  {
	  	  return name+"..."+age;
	  }
	  public int compareTo(Mem obj1)
	{
//		  System.out.println(CollectionChecking.ls);
//		  System.out.println();

		  if(this.age>obj1.age)
		{
//			  x++;
			  
			  System.out.println("in the if x="+x+"  "+this.age+"  "+obj1.age+"  "+CollectionChecking.ls);
			  return 1;
		}
		else if(this.age<obj1.age)
		{
//			y++;
			  System.out.println(" in the else y="+y+"  "+this.age+"  "+obj1.age+" "+CollectionChecking.ls);
			return -1;
		}
		return 0;
    }
}


