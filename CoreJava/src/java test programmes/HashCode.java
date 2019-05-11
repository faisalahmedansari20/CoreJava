class HashCode
{ public static void main(String[] args)
 {
   System.out.println("hashcode check for string :");

   String s="java";
   System.out.println(s.hashCode());
   
  System.out.println("one more");
  String s2="java";
  System.out.println(s2.hashCode());

   s=s+"malik";
   System.out.println(s.hashCode());


   System.out.println("hashcode check for StringBuffer");

   StringBuffer sb=new StringBuffer("java");
   System.out.println(sb.hashCode());

   sb.append("malik");
   System.out.println(sb.hashCode());
   }
}