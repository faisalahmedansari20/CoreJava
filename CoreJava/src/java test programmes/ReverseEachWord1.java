class ReverseEachWord1
{
	String ss="";
 public  String word(String str)
 {
  String  w[]=str.split("\\s");
 
 
  for(String wd:w)
  {
  System.out.println(wd);
  String str3=wd;
  char ch[]=wd.toCharArray();
  
  int i=ch.length;

   for(int k=i-1;i>=0;i--)
   {
    ss+=str3.charAt[k];
    }
    ss=ss;
    }
    return s;
    }
}

  
  public class MainString
{
    public static void main(String[] args)
    {
      ReverseEachWord1 rs=new ReverseEachWord1();
     System.out.println(rs.word("wakeel"));
     }
}
