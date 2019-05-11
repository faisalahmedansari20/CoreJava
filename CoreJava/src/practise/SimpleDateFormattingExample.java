import java.util.*;
import java.text.*;

public class SimpleDateFormattingExample
{
	public static void main(String[] args)
	{
		Date dt=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String s=formatter.format(dt);

		System.out.println(s);
	}
}