class A
{
	int k=9;
	public void mk()
	{
		System.out.println("Class A MK method");
	}
}

class B extends A
{
	int k=10;
	public void mk()
	{
		System.out.println("class B mk method ");
	}
}

 class MainClassSuper extends B
 {
	 int k=11;
	 public void mk()
	 {
		 System.out.println("MainCLass mk method");
	 }

	 public static void main(String[] args)
	 {
		 B obj=new MainClassSuper();
		 System.out.println(objs.k);
	 }
 }

       










