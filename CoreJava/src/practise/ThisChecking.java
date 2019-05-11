class ThisChecking
{
	String s=null;
	int k;

	public void mk(String str)
	{
		System.out.println(s+" "+k);
		this.s=str;
		System.out.println(s);
	}

	public static void main(String[] args)
	{
      ThisChecking obj=new ThisChecking();
	  String st=null;
	   obj.mk(st);
	}
}