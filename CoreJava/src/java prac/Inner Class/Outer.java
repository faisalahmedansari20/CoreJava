



/*
interface Vehicle
{
	public int m1();

	class DefVehicle implements Vehicle
	{
		public int m1()
		{
			return 3;
		}
	}
}

class   Bus implements Vehicle
{
	public int m1()
	{
		return 4;
	}
}


class Outer
{ 

  public static void main(String[] args)
	{
	  Vehicle.DefVehicle obj=new Vehicle.DefVehicle();
//      System.out.println(obj.m1());
       Bus obj1=new Bus();
	   System.out.println(obj1.m1());
	}
}
*/



/*interface Out
{
	public void m1();

	interface InOut
	{
		public void m2();
	}
}

    class Test1 implements Out
    {
    	public void m1()
    	{
    		System.out.println("in the out interface m1 method");
    	}
    }

       class Test2 implements Out.InOut
       {
           public void m2()
		   {
			   System.out.println("in the inout interface m2 method");
		   }
       }

class Outer
{ 

  public static void main(String[] args)
	{
	  Test1 obj1=new Test1();
//	  obj1.m1();	
      Test2 obj2=new Test2();
	  obj2.m2();
	}
}
/*


/*
class Outer
{ 
	interface Vehicle
	{
		public int getNoOfWheels();
	}

	  static class Bus implements Vehicle
	   {
	     	public int getNoOfWheels()
	     	 {
	     	 	return 4;
	     	 }
	   }

	   static  class Auto implements Vehicle
	           {
	            	public int getNoOfWheels()
	            	{
	            		return 3;
	           	    }
	           }
  
  public static void main(String[] args)
	{
       Bus b=new Bus();
	   System.out.println(b.getNoOfWheels());
	}
}
/*



/*
class Outer
{ 
	       int x=10;
    static int y=20;
	
  static class InnerStatic
  {
	  public static void mk()
	  {
//		  System.out.println(x);
		  System.out.println(y);
	  }
  }
  public static void main(String[] args)
	{
         InnerStatic i=new InnerStatic();
		 i.mk();
	}
}
/*


/*
class Outer
{
  static class InnerStatic
  {
	  public static void main(String[] args)
	  {
		  System.out.println("in the InnerStatic class");
	  }
  }
  public static void main(String[] args)
	{
	  System.out.println("in the outer class of the main method");
	}
}
/*


/*
class Outer1
{
	static class InnerStatic
	{
		public void mk()
		{
			System.out.println("in the static class method");
		}
	}

//	public static void main(String[] args)
//	{
//		InnerStatic obj=new InnerStatic();
//		obj.mk();
//	}
}

class  Outer
{
	public static void main(String[] args)
	{
        Outer1.InnerStatic i=new Outer1.InnerStatic();
		i.mk();
	}
}
/*

/*
class Outer
{
	public static void main(String[] args)
	{
		new Thread
			( 
			       new Runnable()
		          {
			         public void run()
			         {
						System.out.println(Thread.currentThread().getName());
			         	System.out.println("in the run method");
			         }
				  }
		     ).start();
	 
			 for(int x=0;x<10;x++)
		      {
				 System.out.println("hi");
			  }
	}
}
/*


/*
class Outer
{
	public static void main(String[] args)
	{
		Runnable r=new Runnable()
		{
			public void run()
			{
	            System.out.println(Thread.currentThread().getName());
				System.out.println("in the runnable inner class");
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}
*/


/*
class Outer
{
	public static void main(String[] args)
	{
		Thread t=new Thread()
		{
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("in the run method");
			}
		};
           t.start();
		     for(int x=0;x<10;x++)
		     {
			   System.out.println(x);
			 }
	}
}
*/


/*
class PopCorn
{
	public void mk()
	{
		System.out.println("Tasty");
	}
}

class Outer
{
	public static void main(String[] args)
	{
		PopCorn p=new PopCorn()
		{
			public void mk()
			{
				System.out.println("Spicy");
			}
		};
		p.mk();
		System.out.println(p.getClass().getName());

		PopCorn p1=new PopCorn();
		p1.mk();
		System.out.println(p1.getClass().getName());

		PopCorn p2=new PopCorn()
		{
			public void mk()
			{
				System.out.println("Salty");
			}
		};
		p2.mk();
		System.out.println(p2.getClass().getName());
    }
}
*/




/*
class Outer 
{ 
	       public void mk()
	       {
			    int y=100;
	          class Inner
	         { 
	       	     public void m1()
	       		  {
	       		      System.out.println("y="+y);
	       	   	  }
	       	 }
	       	        Inner i=new Inner();
	       	        i.m1();
	      }
	        public static void main(String[] args)
	         {
                 Outer o=new Outer();
		         o.mk();
	         }
}
*/

/*
class Outer 
{ 
	       public void mk()
	       {
			    int y=100;
	          class Inner
	         { 
	       	     public void m1()
	       		  {
	       		      System.out.println("y="+y);
	       	   	  }
	       	 }
	       	        Inner i=new Inner();
	       	        i.m1();
	      }
	        public static void main(String[] args)
	         {
                 Outer o=new Outer();
		         o.mk();
	         }
}
*/



/*
class Outer 
{
	int x=100;
	       public void mk()
	       {
			   int x=10;
	          class Inner
	         { 
				  int x=100;
	       	     public void m1()
	       		  {
	       		      System.out.println("x="+x);
	       	   	  }
	       	 }
	       	        Inner i=new Inner();
	       	        i.m1();
	      }
	        public static void main(String[] args)
	         {
                 Outer o=new Outer();
		         o.mk();
	         }
}
*/


/*
class Outer 
{
	 int x=10;
	 int y=20;

		Outer()
	     {
          this.x=x;
		 }

	       public void mk()
	       {
	          class Inner
	         {
	       	     public void m1()
	       		  {
	       		      System.out.println("x="+x);
	       			  System.out.println("y="+y);
	       	   	  }
	       	 }
	       	        Inner i=new Inner();
	       	        i.m1();
	      }
	        public static void main(String[] args)
	         {
                 Outer o=new Outer();
		         o.mk();
	         }
}
*/




/*
class Outer 
{
	static int x=10;
	       int y=20;
	public void mk()
	{
	   class Inner
	    {
		  public  void m1()
			{
			  System.out.println("x="+x);
			  System.out.println("y="+y);
			}
		}
		 Inner i=new Inner();
		 i.m1();
	}
	   public static void main(String[] args)
	   {
          Outer o=new Outer();
		  o.mk();
	   }
}
*/


/*
class Outer 
{
	public void mk()
	{
	   class Inner
	    {
		   int x;
		   int y;
		   Inner(int x,int y)
			{
			   this.x=x;
			   this.y=y;
			}
		  public  void m1(int x,int y)
			{
			  System.out.println(x+y);
//			System.out.println("Inner of Inner");
			}
		}
		 Inner i=new Inner(10,20);
		 i.m1(30,40);
	}
	   public static void main(String[] args)
	   {
          Outer o=new Outer();
		  o.mk();
	   }
}
*/



/*
class Outer 
{
	class Inner
	{
		class InnerInner
		{
		public  void m1()
			{
			System.out.println("Inner of Inner");
			}
		}
	}
	   public static void main(String[] args)
	   {
          Outer o=new Outer();
		  Outer.Inner i=o.new Inner();
		  Outer.Inner.InnerInner ii=i.new InnerInner();
		  ii.m1();
	   }
}
*/




/*
class Outer 
{
	int x=10;
	class Inner
	{
		int x=100;
		public  void m1()
		{
			int x=1000;
			System.out.println(x);
//			System.out.println(this.x);
            System.out.println(Inner.this.x);
			System.out.println(Outer.this.x);
		}
	}

	public static void main(String[] args)
	{
		  
          Outer o=new Outer();
		  Outer.Inner i=o.new Inner();
		  i.m1();
	}
}
*/




/*
class Outer 
{
	int x=10;
	static int y=30;
	class Inner
	{
		public  void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args)
	{
		  
          Outer o=new Outer();
		  Outer.Inner i=o.new Inner();
		  i.m1();
	}
}
*/






/*
class Outer 
{
	int x=10;
	static int y=30;
	class Inner
	{
		public  void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public void m2()
	{
		Inner i=new Inner();
		i.m1();
	}

	public static void main(String[] args)
	{
          Outer o=new Outer();
		  o.m2();
	}
}
*/







/*
class Outer 
{
	class Inner
	{
		public  void m1()
		{
			System.out.println("hi");
		}
	}
	public void m2()
	{
		Inner i=new Inner();
		i.m1();
	}

	public static void main(String[] args)
	{
          Outer o=new Outer();
		  o.m2();
	}
}
*/








/*
class Outer 
{
	class Inner
	{
		public  void m1()
		{
			System.out.println("hi");
		}
	}

	public static void main(String[] args)
	{
//		Outer o=new Outer();
//		Outer.Inner i=new Outer().new Inner();
//		i.m1();
		new Outer().new Inner().m1();

	}
}
*/