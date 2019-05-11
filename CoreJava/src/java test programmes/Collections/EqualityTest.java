class EqualityTest
{
 public static void main(String[] args)
 {
  String s1=new String("Sachin");
  String s2=new String("Sachin");
 
  String s3="Shewag";
  String s4="Shewag";

  System.out.println("s3==s4"+s3==s4);
  System.out.println("s3.equals(s4)"+s3.equals(s4));


  //System.out.println(s1.compareTo(s2));

 // System.out.println(s1==s2);
  //System.out.println(s1.equals(s2)+" hashcode  ;"+s1.hashCode()+"="+s2.hashCode());
  }
}