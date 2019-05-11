class ReverseEachWord12
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

  
  public class MainString1
{
    public static void main(String[] args)
    {
      ReverseEachWord121 rs=new ReverseEachWord121();
     System.out.println(rs.word("wakeel"));
     }
}
