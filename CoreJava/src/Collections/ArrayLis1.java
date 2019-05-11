import java.util.*;

public class ArrayLis1
{
	public static void main(String[] args)
	{

       List<String> ls1=new ArrayList<>();
	   ls1.add("wakeel");
	   ls1.add("malik");

		List<String> ls=new ArrayList<>(ls1);
		ls.add("mw");
		ls.add("mk1");


        for(String s:ls)
		{
			System.out.println(s);
		}
	}
}