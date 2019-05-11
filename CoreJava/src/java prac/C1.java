class P1
{
	int i=34;
	public void m1()
	{
		System.out.println("parent");
	}
		public  void m2()
	{
		System.out.println("in the parent of the child  i ");
	}
}

class C1 extends P1
{
	int i=39;
	public  void m2()
	{
		System.out.println("in the child");
	}
//	public void m1()
//	{
//		System.out.println("parent in the child m1");
//	}
	

	public static void main(String[] args)
	{
//		P1 p=new P1();
//		p.m1();
//		p.m2();
//        C1 c=new C1();
//		c.m1();
//		c.m2();
        
		P1 obj=new C1();
		obj.m1();
		System.out.println(obj.i);
        obj.m2();
  
  }
}
