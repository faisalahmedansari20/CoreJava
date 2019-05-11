import java.util.*;

class TypeSafe
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("malik");
        al.add(new Integer(10));
	}
}