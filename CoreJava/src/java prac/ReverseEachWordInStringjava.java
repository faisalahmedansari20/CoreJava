import java.text.SimpleDateFormat;
import java.util.Date;

clas StringtoDate
{
	public static void main(String[] args)
	{
		String s="23/01/2018";

		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println(date);
	}
	}
	 