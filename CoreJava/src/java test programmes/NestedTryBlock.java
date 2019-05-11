class NestedTryBlock
{
 public static void main(String[] args)
 {
  try
  {
   try
   {
    System.out.println("going to divide ");
    int b=30/0;
    }
    catch(ArithmeticException e)
    {
     System.out.println(e);
     }

     try
     {
      int a[]=new int[5];
      a[4]=4;
	  System.out.println("no error in array");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
       System.out.println(e);
       }

       System.out.println("other exception ");
       }
       catch(Exception e)
       {
        System.out.println("handled");
       }
       System.out.println("normal flow");
       }
}

