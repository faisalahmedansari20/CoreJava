class Parents extends Childs
{
 public void mans()
 {
  System.out.println(" parent is call ");
  }

  }

  public class Childs
  {
    public void mans()
    {
     System.out.println("child is called");
     }

     public static void main(String[] args)
     {
       Childs chl=new Childs();
       Parents prnt= new Parents();
   
			
    chl.mans();
    prnt.mans();
     }
      
}

   