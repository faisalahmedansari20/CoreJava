class Mmmm
{
  public static void main(String[] args)
  {
	  int o=0;
	  System.out.println(o);
   String stringA=" wild";
   String stringB=" Irish";
   String stringC=" Rose";

   String Result=stringA.trim()+stringB+stringC.trim();
  // System.out.println(Result);
   
   String[] arr={"xyz","mm","zz"};
//   System.out.println(arr.length);
   
    String a="meow";
	String ab=a+"deal";
	String abc="meowdeal";
   // System.out.println(ab.hashCode());
  //  System.out.println(abc.hashCode());

//	System.out.println(ab.equals(abc));

	String s4="hi";
	String s5=new String("hi");

//	System.out.println(s4==s5);
//    System.out.println(s4.equals(s5));

   String s7=new String("how");
   String s8=new String("how");
     s8.intern();

   System.out.println(s7==s8);
   System.out.println(s7.equals(s8));



   }
}