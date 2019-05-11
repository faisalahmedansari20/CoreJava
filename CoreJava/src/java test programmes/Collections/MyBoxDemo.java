class MyBox<Integer>
{
 Integer s;
  public void put(Integer s)
  {
   this.s=s;
   }
    public Integer get()
    {
     return s;
     }
}

class MyBoxDemo
{
 public static void main(String[] args)
 {
  MyBox<Integer> obj;
  obj=new MyBox<Integer>();
  obj.put(22);
  obj.put(new Integer(32));

  Integer ss=obj.get();
  System.out.println(ss);
  }
}