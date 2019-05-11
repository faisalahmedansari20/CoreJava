class BoxDemo
{
	Object o;
	public void put(Object o)
	{
		this.o=o;
	}

	public Object get()
	{
		return o;
	}
}
 
class Box
{
	public static void main(String[] args)
	{
		BoxDemo b=new BoxDemo();
		String s="hi how are you";

		b.put(s);
		Object oo=b.get();
		String ss=(String)oo
			;
		System.out.println(ss);
	}
}
	 
