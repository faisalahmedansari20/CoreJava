class HashCheck
{
 //public void mk(Object obj11,Object obj12)
   public void mk(Object obj1)
 {
     System.out.println(obj1+"=="+this);
	 System.out.println(obj1.hashCode()+"=="+this.hashCode());
//	 System.out.println(obj11+"=="+obj12+"=="+this);
  //   System.out.println(obj11.hashCode()+"=="+obj12.hashCode()+"=="+this.hashCode());
 }

  public static void main(String[] args)
  {
   HashCheck obj1=new HashCheck();
   HashCheck obj2=new HashCheck();
   System.out.println(obj1.equals(obj2));
  // HashCheck obj3=new HashCheck();
//      obj1.mk(obj1);

//    obj1.mk(obj1,obj2);
    }
    }