// program to display all active threads name belongs to System group and its Child  Groups
import java.util.*;
class ThreadNames
{
	public static void main(String[]args)
	{
		ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
		Thread[] t=new Thread[system.activeCount()];
		ThreadGroup[] tg=new ThreadGroup[system.activeGroupCount()];
		system.enumerate(tg);

		for(ThreadGroup gr:tg)
		{
			System.out.println("group names ="+gr.getName());
		}
         int x=0;
		system.enumerate(t);
     List<String> ls=new ArrayList<>();
		for(Thread t1:t)
		{
			System.out.println(t1.getName()+" "+t1.isDaemon());
		    ls.add(t1.getName());
			 x++;
		}
		System.out.println(ls);
		System.out.println("total number of threads in the current threadGroup is="+x);
	}
}