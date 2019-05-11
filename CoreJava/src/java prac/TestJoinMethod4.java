class TestJoinMethod4 extends Thread
	{  
 public void run()
	 {  
  System.out.println(Thread.currentThread().getName());  
 }  
   
 public static void main(String args[])
	 {
	 Thread.currentThread().setName("M"); 
//	   System.out.println("in the main method="+Thread.currentThread().setName("M"));  
	   System.out.println("in the main method="+Thread.currentThread().getName());  

  TestJoinMethod4 t1=new TestJoinMethod4();  
  TestJoinMethod4 t2=new TestJoinMethod4();  
  
  t1.start();  
  t2.start();  
 }  
} 