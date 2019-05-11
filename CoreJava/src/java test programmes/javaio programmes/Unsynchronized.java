class Common {

public synchronized void synchronizedMethod1() {
System.out.println("synchronizedMethod1 called by thread ="+Thread.currentThread().getName());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod1 done by the thread="+Thread.currentThread().getName());
}
public void method1() {
System.out.println("Method 1 called by the Thread="+Thread.currentThread().getName());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Method 1 done by the Thread="+Thread.currentThread().getName());
}
}
public class Unsynchronized extends Thread {
private int id = 0;
private Common common;

public Unsynchronized(String name, int no, Common object) {
super(name);
common = object;
id = no;
}

public void run() {
System.out.println("Running Thread" + this.getName());
try {
if (id == 0) {
common.synchronizedMethod1();
} else {
common.method1();
}
} catch (Exception e) {
e.printStackTrace();
}
}

public static void main(String[] args) {
Common c = new Common();
Unsynchronized t1 = new Unsynchronized("MyThread-1", 0, c);
Unsynchronized t2 = new Unsynchronized("MyThread-2", 1, c);
t1.setName("Thread-1");
t2.setName("Thread-2");
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