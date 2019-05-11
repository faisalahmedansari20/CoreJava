import java.io.*;

class CheckedParent
{
 public void mk()
 {
  System.out.println("checked in the Parent");
  }
  }

  class CheckedChild extends CheckedParent
  {
   public void mk() throws ArithmeticException
   {
    System.out.println("child");
    }
    public static void main(String[] args)
    {
      CheckedParent chkp=new CheckedChild();
      chkp.mk();
      }
   }
    