import java.util.*;
class StringSplit
{
	public static void main(String[] args)
	{
      String s = "Pankaj , New York , USA";
      String[] data = s.split("a");
         System.out.println(Arrays.toString(data));



	  for(String ss:data)
		{
//         System.out.println(ss);
		}
//      System.out.println(data.length);
//	  System.out.println("Name = "+data[1]); //Pankaj
//      System.out.println("Address = "+data[1]); //New York,USA
	}
}