class ThreadGroupChecking
{
	public static void main(String[] args)
	{
		Thread th=Thread.currentThread();
		System.out.println(th.getThreadGroup().getParent().getName());
		ThreadGroup tg1=new ThreadGroup("MW");
        System.out.println(tg1.getParent().getName());
		ThreadGroup tg2=new ThreadGroup(tg1,"MK");
		System.out.println(tg2.getParent().getName());
//		System.out.println(Thread.currentThread().getThreadGroup().getName());
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}
}