class SupChecking
{
   public SupChecking(String s)
	{
	   System.out.println(s);
	}

 public void mk()
 {
  System.out.println("yes");
  }
  }

  public class SubCheck extends SupChecking
  {

   public SubCheck(String s)
	  {
		super(s);
	  }

   public void gk()
   {
   System.out.println("no");
   }

   public static void main(String[] args)
	  {
	   SubCheck obj=new SubCheck("how are you");
	  }
  }