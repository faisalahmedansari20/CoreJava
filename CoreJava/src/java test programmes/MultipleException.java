class MultipleException
{
 public static void main(String[] args)
 {
  try
  {
   int a[]=new int[5];
   a[5]=30/0;
   }

//   catch(Exception e)
//   {
//    System.out.println("Arithmetic Executed ");
//    }

  catch(ArrayIndexOutOfBoundsException e)
     {
      System.out.println("Exception is Occured");
      }
 
    catch(ArithmeticException  e)
    {
     System.out.println("ArrayIndexOutOfBoundsException Occurs");
     }

     
      }
      }