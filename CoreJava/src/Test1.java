class A
{
    int i;
 
    public A(int i)
    {
        this.i = i;
    }
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method, i = "+i);
    }
}
 
public class Test1
{
   public static void main(String[] args)
   {
       //Creating two instances of class A
 
       A a1 = new A(10);
 
       A a2 = new A(20);      
 
       //Assigning a2 to a1
 
       a1 = a2;
 
       //Now both a1 and a2 will be pointing same object 
 
       //An object earlier referred by a1 will become abandoned
 
           //Calling garbage collector thread explicitly
 
       System.gc();              //OR call Runtime.getRuntime().gc();
 
       System.out.println("done");
   }
}