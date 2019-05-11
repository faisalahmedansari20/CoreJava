class ExceptionOnCompileTime
{
 public static void main(String[] args) 
 {
  try
  {
//	  System.out.println("hi before");
		int data=50/0;
//		System.out.println("Hi how are you ");
  }
  catch (Exception e)
  {
//	  System.out.println("hi in catch block");
/	  System.out.println(e);
  //    System.out.println("hi in after catch block");
      e.printStackTrace();
  }


  System.out.println("rest of the code ");
  }

}