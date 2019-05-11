class StringPalindromeChecked
{
 public static Boolean check(String str)
 {
  String st=str;
  String st1="";
  char ch[]=st.toCharArray();
  for(int i=(ch.length)-1;i>=0;i--)
  {
   st1+=ch[i];
   }
   System.out.println(st1);
   if(st1.equals(st))
   {
    return true;
    }
    else
    {
     return false;
     }
     }
}

public class MainStringPalindromeChecked
{
 public static void main(String[] args)
 {
  System.out.println("The Number is abc : "+StringPalindromeChecked.check("aa")+": " );
  }
  }