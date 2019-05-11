class Reverse
{
 public static String revesedString(String str)
 {
  System.out.println(str.length());
  char ch[]=str.toCharArray();
  String rev="";
  for(int i=ch.length-1;i>=0;i--)
  {
    rev+=ch[i];
    }
    return rev;
    }
}

class MainReverse
{
 public static void main(String[] args)
 {
  System.out.println(Reverse.revesedString("abc"));
  }
  }