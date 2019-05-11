import java.util.*;
import java.text.*;

public class StringToDate
 {
	 public static void main(String[] args)
	 {
		 SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
   try
   {
		 Date dt=formatter.parse("11/12/2017");
		 System.out.println(dt);
   }
   catch (Exception e)
   {
	   System.out.println(e);
   }
	
	 }
 }
