public class Emp 
{
	private int age ;
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
	public static void main(String[] args)
	{
      Emp e=new Emp(58);	
	  System.out.println(e);
//	  System.out.println(e.hashCode());
	}

}