class  NormClass
{
	public void message()
	{
		          System.out.println();

	}
}

public class MainClass
{
	public static  void main(String[] args)
	{
		Class c=Class.forName("NormClass");
		NormClass obj=(NormClass)c.newInstance();
		obj.message();
	}
} 
