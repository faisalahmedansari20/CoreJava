import java.util.*;
import java.text.*;

class DateCheckingFormate
{
	public static void main(String[] args)
	{
		Date dt=new Date();
		System.out.println("Date ="+dt);
	
	   // SimpleDateFormat sim=new SimpleDateFormat("E, MM/dd/yyyy hh:mm:ss zzzz");   // or
          Format sim=new SimpleDateFormat();
		 String s=sim.format(dt);
		 System.out.println("Simple Date Format="+s);
	}
}