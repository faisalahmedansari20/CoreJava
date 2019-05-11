class Thread22 implements Runnable
{
 public void run()
 {
  System.out.println(Thread.currentThread().getName());
  }

  public static void main(String[] args)
  {
   Thread22 t=new Thread22();
   ThreadGroup tg1=new ThreadGroup("parent ThreadGroup");

   Thread t1=new Thread(tg1,t,"one");
   t1.start();

   Thread t2=new Thread(tg1,t,"two");
   t2.start();

   Thread t3=new Thread(tg1,t,"three");
   t3.start();



   System.out.println("Thread Group Name: "+tg1.getName());

   tg1.list();
   }
}