class Multi33 implements Runnable
{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi33 m1=new Multi33();  
  //Runnable m1=new Runnable();
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  