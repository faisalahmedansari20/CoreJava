import java.util.*;

class TreeSets
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
/*        SortedSet t=new SortedSet();
		t.add("A");
 		t.add("B");
        t.add("a");
		t.add("Z");
        t.add("X");*/
		t.add(null);  // java.lang.NullPointerException will be thrown at runtime
//		t.add(new Integer(10));   // ClassCastException will be thrown at runtime 

		System.out.println(t);
	}

}