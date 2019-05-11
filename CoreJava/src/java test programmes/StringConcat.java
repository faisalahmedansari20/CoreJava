class  StringConcat
{
 public static void main(String[] args)
 {
   String s="abc";
   String a="ab";

    a=a.concat("c");

    //System.out.println(a);
      System.out.println(a==s);
	  System.out.println(a.equals(s));

    }
}