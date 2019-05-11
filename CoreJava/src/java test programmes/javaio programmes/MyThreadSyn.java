class Common {
public synchronized void synchronizedMethod1() {
System.out.println("synchronizedMethod1 called");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod1 done");
}

public synchronized void synchronizedMethod2() {
System.out.println("synchronizedMethod2 called");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod2 done");
}
}
public class MyThreadSyn extends Thread {
private int id = 0;
private Common common;

public MyThreadSyn(String name, int no, Common object) {
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
common.synchronizedMethod2();
}
} catch (Exception e) {
e.printStackTrace();
}
}

public static void main(String[] args) {
Common c = new Common();
Common c1=new Common();
MyThreadSyn t1 = new MyThreadSyn("MyThread-1", 0, c);
MyThreadSyn t2 = new MyThreadSyn("MyThread-2", 1, c);
t1.start();
t2.start();
}
}