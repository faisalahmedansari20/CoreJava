class StringLength
{
 public static String stringl(String str)
 {
	
   int i=str.length();
   System.out.println(i);
   String mk=str;
   for(int k=i-1;i>=0;i--)
   {
    st+=mk.charAt[i];
    }
    return st;
    }
}

public class MainStringLength
{
public static void main(String[] args)
{
 System.out.println(StringLength.stringl("abc"));
 }
}