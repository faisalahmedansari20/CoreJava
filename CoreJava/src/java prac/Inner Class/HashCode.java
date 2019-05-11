class HashCode
{
	public void mk()
	{
		System.out.println(this);
	}

	public static void main(String[] args)
	{
		HashCode hs=new HashCode();
        HashCode hs1=new HashCode();
		hs.mk();
		System.out.println(hs);
	    System.out.println(hs1);
	}
}