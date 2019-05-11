public class Noclass
{
	public void mk()
	{
		System.out.println("in the mk");
	}

	public static void main(String[] args)
	{
         Noclass obj=new Noclass();
		   obj.mk();
		   new Wk().mm();
	}
		 
}

class Wk
{
 public  void mm()
 {
  System.out.println("inside the mm");

  }
 }	