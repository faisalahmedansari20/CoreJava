class Objects
{
	public static void main(String[] args)
	{
          Objects O=new Objects();
          Objects obj=new Objects();
		  System.out.println("O hashCode="+O.hashCode()+"  obj hashCode="+obj.hashCode());
		System.out.println("haschCode ="+O.equals(obj));
	}
}