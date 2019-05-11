class Excep
{
 public void mk(int age) throws Exception
 {
	try{

	
   if(age<18)
    throw new NullPointerException("Not Eligible For Vote");
    else
    System.out.println("Welcome To Vote");
    }
	catch(Exception e)
	 {
		System.out.println(e);
	 }
	}

    public static void main(String[] args)
    {
		try
		{
        Excep e=new Excep();
        e.mk(15);			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	System.out.println("rest of the code ");
	}
}