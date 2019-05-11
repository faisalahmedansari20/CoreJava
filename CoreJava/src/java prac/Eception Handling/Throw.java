import java.sql.*;

class Throw
{

	public static void main(String[] args)
	{
try
{
	       throw new Exception("zzzz");
}
catch (Throwable e)
{
	System.out.println("in the catch block");
}
//	   System.out.println("wdaw");
//		throw new ArithmeticException("divid by zero innnn");
	}
}





//class Throw
//{
////		static ArithmeticException e;
//	static ArithmeticException e=new ArithmeticException();
//
//	public static void main(String[] args)throws ArithmeticException
//	{
//
//       throw e;
////		throw new ArithmeticException("divid by zero innnn");
//	}
//}


//class Throw
//{
//	public static void main(String[] args)
//	{
//		System.out.println(10/0);
//	}
//}
