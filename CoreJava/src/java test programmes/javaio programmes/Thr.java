import java.util.*;

public class Thr implements Runnable
{
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		 ThreadGroup tg1=new ThreadGroup("yes");
		 
		 Thr t=new Thr();

		 Thread t1=new Thread(tg1,t,"one");
		 t1.start();

		 Thread t2=new Thread(tg1,t,"two");
		 t2.start();

		 System.out.println("Thread Group name is ="+tg1.getName());
		 tg1.list();
	}
}

