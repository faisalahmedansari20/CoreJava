import java.util.*;

class Pub
{
// public <T>void mk()
//   public <T extends Number>void mk()
//   public <T extends Number&Runnable>void mk()
//     public <T extends Comparable&Runnable>void mk()
//      public <T extends Number&Comparable&Runnable>void mk()
//      public <T extends Runnable&Number>void mk()//error


	{
	}

	public static void main(String[] args)
	{
//       ArrayList<?> al=new ArrayList();
 
//         ArrayList<?> al=new ArrayList<String>();
         ArrayList<? extends Number> al=new ArrayList<Integer>();
         

		System.out.println("yes");
	}
}