import java.util.*;

class Dup
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("a");
		al.add("c");
		al.add("d");
		al.add("g");

     System.out.println(al);

	 HashSet hs=new HashSet();
	 hs.addAll(al);
	 al.clear();
	 al.addAll(hs);
	 System.out.println(al);
	}

}