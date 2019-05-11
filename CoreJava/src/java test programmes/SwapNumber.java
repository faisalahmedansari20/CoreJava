class SwapNumber
{
 public static void main(String[] args)
 {
  String s="java";
  String s1="linux";

  System.out.println("before :"+s+" "+s1);

  s=s+s1;


  s1=s.substring(0,s.length()-s1.length());
  s=s.substring(s1.length());

  System.out.println("after swaping the :"+s+" "+s1);
  }
}

