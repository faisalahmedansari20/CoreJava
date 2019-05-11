class A1
{
    String s = "Class A";
}
 
class B1 extends A1
{
    String s = "Class B1";
 
    {
        System.out.println(super.s);
    }
}
 
class C1 extends B1
{
    String s = "Class C1";
 
    {
        System.out.println(super.s);
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
        C1 c = new C1();
 
//        System.out.println(c.s);
    }
}