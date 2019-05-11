class PalindromeCheck
{
public static boolean isPalindrome(String str)
{
 StringBuilder sb=new StringBuilder();
  sb=sb.reverse();
 System.out.println(sb);
 String rev=sb.toString();
 System.out.println(rev);
 if(str.equals(rev))
 {
  return true;
  }
  else
  {
   return false;
   }
   }
}

public class TestPalindrome
{
 public static void main(String[] args)
 {
  System.out.println(PalindromeCheck.isPalindrome("abc"));
  }
}
