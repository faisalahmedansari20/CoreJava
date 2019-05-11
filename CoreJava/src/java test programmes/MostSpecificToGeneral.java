class MostSpecificToGeneral
{
 public static void main(String[] args)
 {
  try
  {
     int a[]=new int[5];
     a[5]=30/0;
     System.out.println("a[] will execute");
     }

     catch(ArithmeticException e)
     {
      System.out.println("task 1 is completed");
      }

      catch(ArrayIndexOutOfBoundsException e)
      {
       System.out.println("task 2 is completed ");
       }

       catch(Exception e)
       {
        System.out.println("exception occured");
	    }

	System.out.println("Rest of the code will be Executed");
 }

}
