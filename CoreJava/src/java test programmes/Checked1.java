public class Checked1 
{
	public  Object Checked12()
	{
       return getClass();
	}
    
	 public Object Checked123(int k)
	{
        return getClass();
     }


	public static void main(String[] args) 
	{
     
	 Checked1 chk1= new Checked1();

	 System.out.println(chk1.Checked12());
	 
	 System.out.println(chk1.Checked123());
		
	}

}
