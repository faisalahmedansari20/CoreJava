class CheckObject
{ 
	@Override
	public String toString()
	{
		 return "yes";
	}
 public static void main(String[] args)
	{
	 CheckObject obj=new CheckObject();

	 System.out.println(obj.hashCode());
	}
}