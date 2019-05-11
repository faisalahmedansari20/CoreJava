import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  

public class SimpleDateFormatExample2 {  
public static void main(String[] args) {  
   
	          Date date = new Date();  
              
			  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
              
			  String strDate = formatter.format(date);  
              System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
  	          
              formatter = new SimpleDateFormat("E ,dd-MM-yyyy hh:mm:ss zzzz");  
              strDate = formatter.format(date);  
              System.out.println("Date Format with dd-MM-yyyy hh:mm:ss zzzz: "+strDate);  
  	          
              formatter = new SimpleDateFormat("dd MM yyyy");  
              strDate = formatter.format(date);  
              System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
  	          
              formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
              strDate = formatter.format(date);  
              System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
  	          
              formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss zzzz");  
              strDate = formatter.format(date);  
              System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss zzzz : "+strDate);  
}  
}  