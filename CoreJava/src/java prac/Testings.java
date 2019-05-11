class P
{
	public void m1()
	{
		System.out.println("parent");
	}
	public void m2()
	{
		System.out.println("in the child in the P");
	}
}

class C extends P
{
	public void m2()
	{
		System.out.println("in the child");
	}
}

class Testings
{
  public static void main(String[] args)
	{
//		P p=new P();
//		p.m1();
//		p.m2();
        C c=new C();
//		c.m1();
//		c.m2();
        
		P obj=new C();
		obj.m1();
        obj.m2();
//  
	}
}