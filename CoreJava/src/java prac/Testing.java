  import java.util.*;

class Testing
{
	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<>();
		l.add("xyz");
		l.add("malik");
//		l.add(10);
        System.out.println(l); 
         m1(l);
		 System.out.println(l);

      }

        public static void m1(ArrayList al)
	{ 
			 al.add(10);
			 al.add(10.5);
	}
}


