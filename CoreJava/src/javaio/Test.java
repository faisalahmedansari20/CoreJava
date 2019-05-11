class Outer1
{
	class Inner
	{
		public void mk()
		{
			System.out.println("in the inner class");
		}
	}

//	 public static void main(String[] args)
//	{
//		 Outer o=new Outer();
//		 Outer.Inner i=o. new Inner();
//		 i.mk();

//	     Outer.Inner i=new Outer().new Inner();
//		 i.mk();
     
//	   new Outer().new Inner().mk();
//	}

}

class Test
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.mk();
	}T
}