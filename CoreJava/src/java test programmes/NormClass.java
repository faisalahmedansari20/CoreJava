class  MainClass
{
	public void message()
	{
		System.out.println("message class");
	}
}

public class NormClass
{
	public static  void main(String[] args)
	{
		Class c=Class.forName("MainClass");
		MainClass obj=(MainClass)c.newInstance();
		obj.message();
	}
} 
