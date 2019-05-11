import java.util.*;

public class Enumerations {

	public static void main(String[] args) 
	{
       Vector v=new Vector();
       
       v.add("one");
       v.add("two");
       v.add("three");
       
       Enumeration e=v.elements();
 
       while(e.hasMoreElements())
       {
		   System.out.println(e.nextElement());
	   }
	}

}
