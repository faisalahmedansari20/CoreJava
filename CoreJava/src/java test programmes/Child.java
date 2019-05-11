class Child extends Super
{
 public void women()
 {
  System.out.println("how  are you");
  }
  public static void main(String[] args)
  {
    Super s1=new Child();
    Child c1=new Child();
   
    s1.women();
    c1.women();

  }
}

  