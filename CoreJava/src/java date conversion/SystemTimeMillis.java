import java.util.*;

class SystemTimeMillis
{
	public static void main(String[] args)
	{
		long l=System.currentTimeMillis();
		Date dt=new Date(l);
		System.out.println(dt);

		Date dt1=new Date();
		Date dt2=new Date();

		System.out.println(dt1.equals(dt2));
	}
}