public class DownCasting
{ 
  public void man()
  {
   System.out.println("how are you ");
   }
     public static void main(String[] args)
     {
       DownUp mk=(DownUp)new DownCasting();

       System.out.println(mk instanceof DownUp);
	 }
 }




 class DownUp  extends DownCasting
 {
   public void mk()
   {
    System.out.println(" hi how are you malik");
    }
  }
