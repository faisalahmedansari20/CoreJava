class Immutable
{
	private int i;

     Immutable(int i)
	{
		 this.i=i;
	}

	public Immutable mk(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return (new Immutable(i));
		}
	}

	public static void main(String[] args)
	{
        Immutable obj1=new Immutable(10);
		Immutable obj4=new Immutable(10);
	
		Immutable obj2=obj4.mk(10);
		Immutable obj3=obj2.mk(100);

		System.out.println(obj2==obj4);
	}
}