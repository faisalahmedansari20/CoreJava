class X
{
    int i = 101010;
 
    public X()
    {
//		System.out.println(i--);
        i = i++ + i-- - i;
        System.out.println("in main ="+i);
    }
 
    static int staticMethod(int k)
    {
		System.out.println("k="+k);
        return --k;
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println(staticMethod(i));
        System.out.println(--i);
    }
}
 
public class MainClasscs
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}