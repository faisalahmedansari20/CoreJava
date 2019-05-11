import java.util.*;

class ToList
{
	public static void main(String[] args)
	{
		Integer[] i={3,4,2,5,3};

		List ls=Arrays.asList(i);
        

        System.out.println(ls.get(0));

        Collections.sort(ls);

		System.out.println(ls);

	}

}