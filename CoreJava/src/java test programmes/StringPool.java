class StringPool
{
 public static void main(String[] args)
 {
  String s1="cat";
  String s2="cat";
  String s3=new String("cat");


  System.out.println("s1==s2 :"+s1==s2);
  System.out.println("s1==s2 :"+s1==s3);
  }

}