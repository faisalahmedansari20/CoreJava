class A
{
	public String  mk(int t)
	{
		System.out.println("in the A");
         return new Object();
	}
	public   String mk(int i,String f)
	{
		System.out.println("in the float");
	  return f;
	}
}

class B extends A
{
	public  Object  mk(int f) 
	{
	    System.out.println("in the B");
	return "";
	}
	public static void main(String[] args)
	{
//      A obj=new A();
//        B obj=new B	();
      A obj=new B();
        
	  obj.mk(49);

	}
}