import java.time.*;
import java.util.*;
 class LocalTime
 {
	 public static void main(String[] args)
	 {
		 LocalDate birthdate=LocalDate.of(1994,5,2);
		 LocalDate today=LocalDate.now();

		 Period p=Period.between(birthdate,today);
//		 System.out.printf("Age is %d years %d Months %d Days ",p.getYears(),p.getMonths(),p.getDays());
        
       int d=p.getYears()*365+p.getMonths()+p.getDays();
//	   System.out.println(d);
//	   System.out.println((60*365)-d);

//            Scanner sc=new Scanner(System.in);
//			System.out.println("insert year");

//	      int year=sc.nextInt();
//		  Year y=Year.of(year);
//		  if(y.isLeap())
//		 {
//			  System.out.println(" a leap year");
//		 }
//		 else
//		 {
//			 System.out.println("it is not a leap year ");
//		 }

              ZoneId zone=ZoneId.systemDefault();
			  System.out.println(zone);

			  ZoneId la=ZoneId.of("india/culcutta");
              ZonedDateTime zt=ZonedDateTime.now(la);
			  System.out.println(zt);




	 }
 }