import java.text.*;
import java.util.Date;

class StringToDateExample
{
 public static void main(String[] args) throws Exception
 {
  String sDate="31/12/1998";
  Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate);
  System.out.println(sDate+"\t"+date1);
  }
}
