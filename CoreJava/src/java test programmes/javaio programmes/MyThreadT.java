import java.util.*;
class Common
	{

public synchronized void synchronizedMethod1() {
System.out.println("synchronizedMethod1 called");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("synchronizedMethod1 done");
}
public void method1() {
System.out.println("Method 1 called");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Method 1 done");
}
}
public class MyThreadT extends Thread {
private int id = 0;
private Common common;

public MyThreadT(String name, int no, Common object) {
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
MyThreadT t1 = new MyThreadT("MyThread-1", 0, c);
MyThreadT t2 = new MyThreadT("MyThread-2", 1, c);
t1.start();
t2.start();
}
}