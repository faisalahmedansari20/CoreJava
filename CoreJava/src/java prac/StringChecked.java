import java.util.*;

class StringChecked
{
	int i;
	String s;

     StringChecked(String s)
	{
		 this.s=s;

	}
	  public String toString()
	{
		  return this.s;
	}

	public static void main(String[] args)
	{
       Map mp=new HashMap();
 
       StringChecked obj1=new StringChecked("malik");
       StringChecked obj2=new StringChecked("malik");

      System.out.println(obj1.hashCode()+" "+obj2.hashCode());

	   mp.put(obj2,"B");
       mp.put(obj1,"A");

	   System.out.println(mp);



	}
}