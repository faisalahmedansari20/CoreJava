public class ClassNotFoundExceptiono
{
	public static void main(String[] args)
	{
//		Class cs=null;
		try
		{
//			cs=Class.forName();
//			Object obj=cs.newInstance();
         Object o=Class.forName(args[0]).newInstance();

		}
		catch (Exception e)
		{
//			System.out.println("hi there is an error "+e);
			e.printStackTrace();
		}
   }
}