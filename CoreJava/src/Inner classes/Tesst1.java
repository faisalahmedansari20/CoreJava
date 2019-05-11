class A
{
	class B
	{
         class C
         {
			 public void mk()
			 {
				 System.out.println("ssinside the inner class  of inner class");
			 }
         }
	}
}

class Tesst1
{
	public static void main(String[] args)
	{
//		A a=new A();
//		A.B b=a.new B();
//		A.B.C c=b.new C();
//      A.B.C c=new A().new B().new C();
        new A().new B().new C().mk();
//		c.mk();
	}

}