class Display1
{
	public void gk()
	{
		System.out.println("in the gk block");
	}
	public static synchronized void  wish(String name)
	{
		for(int i=0;i<=5;i++)
		{
		System.out.print("name of the player=");
         try
         {
	   	  Thread.sleep(20);
         }
         catch (Exception e){}
		 System.out.println(name);
		}
	}
}
 class MyThread1 extends Thread
 {
	 Display1 d;
	 String name;

	 MyThread1(Display1 d,String name)
	 {
		 this.d=d;
		 this.name=name;
	 }
	 public void run()
	 {
		 	 new Display1().gk();

		 d.wish(name);
	 }
 }

 class Synchronized
 {
	 public static void main(String[] args)
	 {
		 Display1 d1=new Display1();
		 Display1 d2=new Display1();
		 MyThread1 t1=new MyThread1(d1,"ahmed");
		 MyThread1 t2=new MyThread1(d2	,"wakeel");

           t1.start();
		   t2.start();
	 }
 }