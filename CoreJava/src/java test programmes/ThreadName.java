import java.lang.*;

class ThreadName extends Thread
{
 public void run()
 {
  // System.out.println("name of the thread :"+Thread.getName());
   }
   public static void main(String[] args)
   {
    ThreadName t1=new ThreadName();
    ThreadName t2=new ThreadName();

    System.out.println("Name of the Thread :"+t1.getName());
    System.out.println("Name of the thread :"+t2.getName());

    t1.start();
    t2.start();

   // System.out.println("name of the thread :"+Thread.getName());
    t1.setName("Ahmed");
    System.out.println("after chnging the name :"+t1.getName());
    }
}

