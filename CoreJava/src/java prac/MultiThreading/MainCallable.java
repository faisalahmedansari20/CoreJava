import java.util.concurrent.*;

class Display6 implements Callable
{
	String name;
	Display6(String name)
	{
		this.name=name;
//		super(name);
	}

	public Object call()throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" responsible to return");
		return 50;
	}
}

class MainCallable
{
	public static void main(String[] args)throws Exception
	{
		Display6[] t1={new Display6(" a "),new Display6(" b "),new Display6(" c "),new Display6(" d "),new Display6(" e "),new Display6(" f ")};
		
		ExecutorService sr=Executors.newFixedThreadPool(3);

		for(Display6 job:t1)
		{
			Future f=sr.submit(job);
            System.out.println(f.get());
		}
		sr.shutdown();
	}
}