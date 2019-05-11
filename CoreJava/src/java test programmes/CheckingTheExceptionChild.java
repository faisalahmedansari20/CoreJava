import java.io.*;

class CheckingTheExceptionParent
{
 public void mk() throws	IOException
 {
  System.out.println("PArent Exception");
  }
  }

  class CheckingTheExceptionChild extends CheckingTheExceptionParent
  {
   public void mk() throws	IOException
   {
	   System.out.println("Child Exception");
	 //  throw new NullPointerException("hi how are you");
     
    }
    public static void main(String[] args)
    {
      CheckingTheExceptionParent p=new      CheckingTheExceptionChild();
      p.mk();
    }
}
