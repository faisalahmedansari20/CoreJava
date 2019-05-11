import java.text.SimpleDateFormat;
import java.util.Date;

class StringtoDate
{
	public static void main(String[] args)
	{
		String s="23/01/2018";
       try
       {
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s);
    		System.out.println(date);
	   }
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}
	 