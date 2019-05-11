public class TwoThreadGetName extends Thread {
   public void run() {
      for (int i = 0; i < 10; i++) {
         printMsg();
      }
   }
   public void printMsg() {
      Thread t = Thread.currentThread();
      String name = t.getName();
      System.out.println("name=" + name);
   } 
   public static void main(String[] args) {
      TwoThreadGetName tt = new TwoThreadGetName();
      TwoThreadGetName tt1 = new TwoThreadGetName();
	  tt.start();
	  try
	  {
		tt.join();
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }

      for (int i = 0; i < 10; i++) {
          System.out.print(" : from the main : "+tt.getName());
		 tt.printMsg();
      }
   }
}