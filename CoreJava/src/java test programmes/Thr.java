import java.util.*;

class Thr extends Thread
{
 public void run()
 {
  System.out.println("thread is running ");
  }

  public static void main(String[] args)
  {
   Thr t=new Thr();
   t.start();
   }
}