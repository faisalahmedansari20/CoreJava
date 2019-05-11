class A
{

}
class B extends A
{

}

 class Base
 {
	 B fun()
	 {
		 System.out.println("base fun()");
		 return new B();
	 }
 }
 class Derive extends Base
 {
	 A fun()
	 {
		 System.out.println("derived fun()");
		 return new A();
	 }
 }

 class MainClass
 {
	 public static void main(String[] args)
	 {
		 Base b=new Base();
		 b.fun();

		 Derive d=new Derive();
		 d.fun();
	 }
 }