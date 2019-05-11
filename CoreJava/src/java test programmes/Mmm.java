class Mmm
{
  private  String command;

  public  Mmm(String s)
  {
   this.command=s;
   System.out.println(command);
   }
 public void mk()
	{
	  System.out.println(command);
	}
   public static void main(String[] args)
   {
    Mmm t=new Mmm("ahmed");
    t.mk();
    }
}