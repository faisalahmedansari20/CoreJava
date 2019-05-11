abstract class Abs
{
//	public void mk()
//	{
//		System.out.println("in parent mk");
//	}
//    public void gk()
//	{
//		System.out.println("in parent mk");
//	}

    abstract void mk();
	abstract void gk();

}
   abstract class Abs1 extends Abs
   {
   	abstract void mn();
   
      
	  public void mk()
      		{
      			System.out.println(" in mk");
      		}
      }

public class Abst extends Abs1
{
     public void gk()
	{
		 System.out.println(" in gk");
	}
	public void mn()
	{
		System.out.println(" in mn");
	}

//   public void mk()
//		{
//			System.out.println(" in mk");
//		}
		public static void main(String[] args)
		{
			Abs1 obj=new Abst();
			obj.mk();
			obj.gk();
			obj.mn();
		}
}
