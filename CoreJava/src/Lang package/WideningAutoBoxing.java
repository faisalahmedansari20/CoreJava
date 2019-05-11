class WideningAutoBoxing
{
	public static void mk(Object l)
	{
//		System.out.println(l);
		Integer i=(Integer)l;
		System.out.println(i.getClass().getName());
	}

    public static void main(String[] args)
	{
        
        Integer I=new Integer(20);
		System.out.println(I.hashCode());

         String s1=new String("abc");
		 String s2=new String("abc");
		 String s3=s2;

//          System.out.println(s3==s2);
//		 System.out.println(s3.hashCode()+" "+s2.hashCode());

		int x=10;
//		mk(x);
	}
}
