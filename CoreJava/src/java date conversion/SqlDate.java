import java.sql.Date;

public class SqlDate
{
	public static void main(String[] args)
	{
        long l=System.currentTimeMillis();
		Date dt=new Date(l);
        System.out.println(dt);							  
	}
}



