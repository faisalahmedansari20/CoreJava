class MyRunnable1 implements Runnable{
 

    @Override
    public void run(){
    	   method1();
    }

 
    static synchronized void method1(){
           System.out.println("static synchronized method1() started");
           MyRunnable1 myRunnable1=new MyRunnable1();
           myRunnable1.method2();
           System.out.println("static synchronized method1() ended");
    }
 
    synchronized void method2(){
           System.out.println("in synchronized method2()");
    }
    
}
 
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class MyClassSameObjectThreads1 {
    public static void main(String args[]) throws InterruptedException{
           
           MyRunnable1 myRunnable1=new MyRunnable1();
           Thread thread1=new Thread(myRunnable1,"Thread-1");
           
		   thread1.start();        
           
           
    }
 
}