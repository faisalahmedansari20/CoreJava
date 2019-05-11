class Box
{
 Object obj;

 public void put(Object obj)
 {
   this.obj=obj;
   }

   public Object get()
   {
    return obj;
    }
}

public class BoxDemo
{
 public static void main(String[] args)
 {
  Box b=new Box();
  String s="Tom";
  b.put(s);

   Object o=b.get();
   String x=(String)o;
   System.out.println(x);
}
}
 

  
