class A
{
    B b1;
    A( )
    {
        b1=new B();
    }
}
 
class B
{
    A a1;
    B( )
    {
        a1=new A();
    }
}
 
public class Main_Class
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj=null;   // inaccessible circular references now exists
    }
}




ddsfdgdf