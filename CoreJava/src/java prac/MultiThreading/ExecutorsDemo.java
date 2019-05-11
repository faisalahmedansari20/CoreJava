import java.util.concurrent.*;

class PrintJobs extends Thread
{
	String name;
	PrintJobs(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println(name+" job started by Thread :"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception ir)
		{
		}
//		System.out.println(name+" job completed by Thred "+Thread.currentThread().getName());
	}
}

class ExecutorsDemo
{
	public static void main(String[] args)
	{
		PrintJobs[] jobs={new PrintJobs(" a "),new  PrintJobs(" b "),new PrintJobs(" c"),new PrintJobs(" d "),new  PrintJobs(" e "),new PrintJobs(" f ")};
        
		ExecutorService  service=Executors.newFixedThreadPool(3);
		for(PrintJobs job: jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}
