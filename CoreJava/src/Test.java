class A
{
    int i = 50;
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
public class Test
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
	
      A a1 = new A();
 
      A a2 = new A();
 
      //Assigning a2 to a1
 
      a1 = a2;
 
      //Making finalize() method to execute forcefully
       
	   System.gc();
//      Runtime.getRuntime().runFinalization();
 
      System.out.println("done");
   }
}