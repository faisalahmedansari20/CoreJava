 class Common 
 {
public synchronized void synchronizedMethod1() 
	{
System.out.println("synchronizedMethod1 called by Thread="+Thread.currentThread().getName());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod1 done by Thread="+Thread.currentThread().getName());
}

public  void synchronizedMethod2() 
	{
System.out.println("synchronizedMethod2 called by Thread="+Thread.currentThread().getName());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod2 done by Thread="+Thread.currentThread().getName());
}
}
public class MyThreadBothSynchronizedMethod extends Thread 
{
private int id = 0;
private Common common;

public MyThreadBothSynchronizedMethod(String name, int no, Common object) {
super(name);
common = object;
id = no;
}

public void run() {
System.out.println("Running Thread=" + this.getName());
try {
if (id == 0) {
common.synchronizedMethod1();
} else {
common.synchronizedMethod2();
}
} catch (Exception e) {
e.printStackTrace();
}
}

public static void main(String[] args) {
Common c = new Common();
Common c1=new Common();
MyThreadBothSynchronizedMethod t1 = new MyThreadBothSynchronizedMethod("MyThread-1", 0, c);
MyThreadBothSynchronizedMethod t2 = new MyThreadBothSynchronizedMethod("MyThread-2", 1, c);
t1.start();
try
{
	t1.join();
}
catch (Exception e)
{
	e.printStackTrace();
}
t2.start();
}
}