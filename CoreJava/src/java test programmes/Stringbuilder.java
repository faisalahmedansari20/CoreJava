class Stringbuilder
{
 public static void main(String[] args)
 {
   StringBuilder sb=new StringBuilder("wakeel");
   StringBuffer sb1=new StringBuffer("abc");
   System.out.println(sb1);
   System.out.println(sb);
   sb.reverse();
   sb1.reverse();
   System.out.println(sb1);
   System.out.println(sb);
}

}