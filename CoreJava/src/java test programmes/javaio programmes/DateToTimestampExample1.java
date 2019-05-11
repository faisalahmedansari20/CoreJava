import java.sql.Timestamp;    
import java.util.Date;    
import java.text.SimpleDateFormat;

 public class DateToTimestampExample1
 {    
       public static void main(String args[]){    
                  Date d=new Date();
				  Timestamp s=new Timestamp(d.getTime());
                   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");                
                System.out.println(formatter.format(s) );                     
        }    
}    
