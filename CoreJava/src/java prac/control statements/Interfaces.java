interface Interfaces
{
	public static void  mk()
	{
		System.out.println(" in the static method");
	}

	public default void gk()
	{
		System.out.println("in the default method of gk");
	}
	public static void main(String[] args)
	{
//        Interfaces.mk();

		System.out.println("in the interface");
	}

}

