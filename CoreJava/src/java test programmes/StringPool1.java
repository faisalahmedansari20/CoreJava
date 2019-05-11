class StringPool1
{
 public static void main(String[] args)
 {
  String s="man";
  String s1="man";
  String s2=new String("man");


  System.out.println("s==s1 :"+s==s1);
  System.out.println("s1==s2 :"+s1==s2);

  System.out.println("s.equals(s1) :"+s.equals(s1));
  System.out.println("s.equals(s2) :"+s.equals(s2));

  }
}

	