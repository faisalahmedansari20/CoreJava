class ImplementsTheRunnableInterface implements Runnable
{
 public void run()
 {
  System.out.println("Runnable");
  }

  public static void main(String[] args)
  {
   ImplementsTheRunnableInterface t=new ImplementsTheRunnableInterface();
   Thread r=new Thread(t);

    r.start();
    }
}