public class Prnt
{
   public void mns()
   {
     System.out.println(" hi how are you");
    }

    public static void main(String[] args)
    {
              
    Prnt p=new Prnt();
    Child1 chld=new Child1();
    Child1 p1=new Child1();

    System.out.println(p instanceof Child1);
    System.out.println(chld instanceof  Child1 );
    System.out.println(p1 instanceof  Child1 );
}
}


     class Child1 extends Prnt
    {
      public void malik()
      {
      System.out.println(" hi how are you malik");
      }
}


