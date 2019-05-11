import java.lang.*;

public class ThreadDemo implements Runnable 
{

   Thread t;
   ThreadDemo() 
   {
    
     // thread created
     t = new Thread(this,"ahmed");
  
      // set thread priority
    //  t.setPriority(1);
      
      // print thread created
      System.out.println("thread  = " + t);
      
      // this will call run() function
      t.start();
   }

   public void run() 
   {
      // returns the name of this Thread.
      System.out.println("Name = " + t.getName());
   }

   public static void main(String args[]) 
   {
      new ThreadDemo();
   }
} 