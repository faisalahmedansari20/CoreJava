class A
{
 private B b;
  public void setB(B b)
  {
   this.b=b;
   }
}

 class B
 {
  private A a;
  
  public void setA(A a)
  {
    this.a=a;
    }
}

 public class Main
 {
  public static void main(String[] args)
  {
   A one=new A();
   B two=new B();

   one.setB(two);
   two.setA(one);

   one=null;
   two=null;
   }
}

