import java.util.*;

class CursorClass
{
	public static void main(String[] args)
	{
		Vector v=new Vector();

		Enumeration e=v.elements();
		Iterator itr=v.iterator();
		ListIterator listltr=v.listIterator();

		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(listltr.getClass().getName());
	} 
}