class A
{
    static int i;
 
    static
    {
        ++i;
    }
 
    {
        i++;
    }
}
 
class B extends A
{
    static
    {
        i--;
    }
 
    {
        System.out.println(i--);
    }
}
 
public class MainClassin
{
    public static void main(String[] args)
    {
        System.out.println(new B().i);
    }
}