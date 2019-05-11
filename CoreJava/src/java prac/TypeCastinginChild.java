class TypeCasting
{
}

public class TypeCastinginChild extends TypeCasting
{
	static void method(TypeCasting a)
	{
       TypeCastinginChild b=(TypeCastinginChild)a;
	   System.out.println("downcasting is performes");
	}




	public static void main(String[] args)
	{
		TypeCasting obj=new	TypeCastinginChild();
		new	TypeCastinginChild().method(obj);
	}
       
}