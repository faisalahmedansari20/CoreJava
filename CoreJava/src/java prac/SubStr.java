class SubStr
{
	public static void main(String[] args)
	{
		String s="yes";
		String s1=s.substring(0,0);
		String s2=s.substring(1,s.length());
		System.out.println("0,0 "+s1);
		System.out.println(" 1,length "+s2);
	
	     String s3=s1+s2;
		 System.out.println("s1+s2 "+s3);

		 int a=10;
		 int b=90;
		 System.out.println("s1+s2 ="+s1+s2);
	}
}