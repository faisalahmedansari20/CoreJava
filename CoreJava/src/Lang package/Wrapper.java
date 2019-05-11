class Wrapper
{
	int i;

	  Wrapper(int i)
	{
		  this.i=i;
	}

	public  int hashCode()
	{
		return this.i;
	}

	public String toString()
	{
		return getClass().getName()+"@"+this.hashCode();
	}

	public static void main(String[] args)
	{
		Wrapper obj1=new Wrapper(10);
         System.out.println(obj1);

	}

}