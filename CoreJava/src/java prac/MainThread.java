class TreadingPrac extends Thread
{
 int x=20;

	public void run()
	{
		++x;
//		System.out.println(x);
	}
}

class MainThread
{
      public static void main(String[] args)
	{
       TreadingPrac obj1=new TreadingPrac();
       TreadingPrac obj2=new TreadingPrac();
	   
//	   System.out.println(" before obj1  x "+obj1.x);
//        System.out.println(" before obj2  x"+obj2.x);
//        obj2.start()s;
          obj2.x=30;
		System.out.println("after obj2 x "+obj2.x);
		System.out.println("after obj1 x "+obj1.x);


//		obj1.run();
//		System.out.println("after obj1 x "+obj1.x);
//		System.out.println("after obj2 x "+obj2.x);

	}
}