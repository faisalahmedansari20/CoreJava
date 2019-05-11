class EqualityCheck
{
 String name,color;
 }

 public class MainEqualityCheck
 {
  public static void main(String[] args)
  {
   EqualityCheck obj1=new EqualityCheck();
   obj1.name="Honda";
   obj1.color="black";

   EqualityCheck obj2=new EqualityCheck();
   obj2.name="Honda";
   obj2.color="black";

   System.out.println(" : obj1.equals(obj2)="+obj1.equals(obj2)+" obj2="+obj2+" obj1="+obj1);

   System.out.println("obj1.name==obj2.name="+obj1.name==obj2.name);
   System.out.println("obj1.color==obj2.color="+obj1.color==obj2.color);

   System.out.println("obj1.name.equals(obj2)="+obj1.name.equals(obj2.name));
   System.out.println("obj1.color.equals(obj2)="+obj1.color.equals(obj2.color));

   }
}
