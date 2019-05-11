class M1
{
    static 
	{
		System.out.println("in static m1");
	}
	{
		System.out.println("in instance m1");
	}

}

class M2 extends M1
{ 
	 static 
	{
		System.out.println("in static m2");
	}
	{
		System.out.println("in instance m2");
	}
     	

	public static void main(String[] args)
	{
    	M2 obj=new M2();
	}
}