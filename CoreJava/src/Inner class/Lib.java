class Lib
{
	public static void main(String[] args)
	{
		System.out.println(String.class.getClassLoader());
		System.out.println(Lib.class.getClassLoader());
		System.out.println(Custo.class.getClassLoader());
	}				   
}