class One
{
	{
    int x = 2121;
	}
}
 
class Two extends One
{
    int x = 1212;	
     
    {
        System.out.println(x);
    }
}
 
public class MainClassj
{
    public static void main(String[] args)
    {
        Two two = new Two();
    }
}