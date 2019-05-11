class Check
{
 public static void main(String[] args)
 {
	  Integer i=90;
	  Integer k=50;

      Integer it=new Integer(50);
	  Integer kt=new Integer(90);
       
      String s="yes";
	  String s1=new String("yes");
      String s2="yes";
//       
//      System.out.println(s==s2); 
//      System.out.println(s==s1); 
//	  System.out.println(s.equals(s1));

      System.out.println(s1.hashCode());
      System.out.println(s.hashCode());
	  System.out.println(s2.hashCode());
    
     


//  System.out.println(i.equals(90));
//  System.out.println(i==k);
//  System.out.println(i.equals(k));
//  
      Check obj=new Check();
	  System.out.println(obj.hashCode());

  }
}