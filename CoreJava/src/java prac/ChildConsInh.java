class ConsInh
{
   ConsInh()
	{
	   System.out.println("ConsInh is inherited");
	}

}

public class ChildConsInh
{
	public static void main(String[] args)
	{
		ConsInh obj=new ConsInh();
		obj.ConsInh();
	}

}