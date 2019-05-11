class Exceptions
{
	public void m1()
	{
//		System.out.println("on first line");
        try
        {
             int x=10/0;
        }
        catch (Throwable e)
        {
//			System.out.println("in the catch block");
//			e.printStackTrace();
//            System.out.println(e);
            System.out.println(e.getMessage());
        }
//	    System.out.println("on third line");
	}
	public static void main(String[] args)
	{
            Exceptions obj=new Exceptions();
			obj.m1();
	}
}