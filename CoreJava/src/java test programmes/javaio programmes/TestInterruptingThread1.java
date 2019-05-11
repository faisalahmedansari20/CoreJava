class TestInterruptingThread1 extends Thread
{  
public void run(){  
try{

	System.out.println(Thread.interrupted());
	System.out.println("dfff");
Thread.sleep(10);  
System.out.println("task");  
}catch(InterruptedException e){  
throw new RuntimeException("Thread interrupted..."+e);  
}  
  
}  
  
public static void main(String args[]){  
TestInterruptingThread1 t1=new TestInterruptingThread1();  
t1.start();  
try{  
t1.interrupt();  
}catch(Exception e){System.out.println("Exception handled "+e);}  
 
  
}  

}  