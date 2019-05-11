import java.time.*;

class Times
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
//		System.out.println(date);

		LocalTime time=LocalTime.now();
//		System.out.println(time);

        int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();

//		System.out.println("day="+dd+"--month="+mm+"--year="+yyyy);
//        System.out.printf("%d-%d-%d",dd,mm,yyyy);
	
	      int h=time.getHour();
		  int m=time.getMinute();
		  int s=time.getSecond();
		  int n=time.getNano();

//		  System.out.println("hour="+h+" minute="+m+" seconds="+s+" nano="+n);
	
         LocalDateTime dt=LocalDateTime.now();
//		 System.out.println(dt);

		 int dd1=dt.getDayOfMonth();
		 int mm1=dt.getMonthValue();
		 int yyyy1=dt.getYear();

//		 System.out.println(dd1+" "+mm1+" "+yyyy1);

		 int h1=dt.getHour();
		 int m1=dt.getMinute();
		 int s1=dt.getSecond();
		 int n1=dt.getNano();

//		 System.out.println(h1+" "+m1+" "+s1+" "+n1);

        LocalDateTime dt1=LocalDateTime.of(1994,05,02,02,44,33);
		System.out.println(dt1);

		System.out.println(dt1.plusMonths(6));
	









	
	}
}