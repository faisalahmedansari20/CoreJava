class  Final
{
		final  int id;

//		static {
//			id=50;
//		}

       Final()
	{
		   id=30;
	}


}

public class ChildFinal extends Final
{
	public static void main(String[] args)
	{
       ChildFinal obj=new ChildFinal();
	   System.out.println(obj.id);
	}
}