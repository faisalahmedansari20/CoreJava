import java.text.*;  
import java.util.Date;  
public class DateFormatExample {  
    public static void main(String[] args) {  
        Date currentDate = new Date();  
        System.out.println("Date: "+currentDate+"\n");  
//        String dateToStr = DateFormat.getInstance().format(currentDate);    //or
           
		  String dateToStr=new SimpleDateFormat().format(currentDate);
		System.out.println("new SimpleDateFormat().format(currentDate)= "+dateToStr+"\n");  
   
	     String ss=DateFormat.getInstance().format(currentDate);
		 System.out.println("DateFormat.getInstance().format(currentDate)= "+ss+"\n");

         String ss1=DateFormat.getDateInstance().format(currentDate);        
		 System.out.println("DateFormat.getDateInstance().format(currentDate)= "+ss1+"\n");

		 String ss2=DateFormat.getTimeInstance().format(currentDate);
		 System.out.println("DateFormat.getTimeInstance().format(currentDate)= "+ss2+"\n");
 

		 String ss3=DateFormat.getDateTimeInstance().format(currentDate);
		 System.out.println("DateFormat.getDateTimeInstance().format(currentDate)= "+ss3+"\n");
	
	
	}  
} 