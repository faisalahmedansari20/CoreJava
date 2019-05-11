import java.util.*;

class ArraySort
{
	Integer i;

      ArraySort(Integer i)
	{
		  this.i=i;
	}

	public static void main(String[] args)
	{
//		ArraySort obj1=new ArraySort(10);
//		ArraySort obj2=new ArraySort(20);
//		ArraySort obj3=new ArraySort(30);

//         ArraySort[] arr=new ArraySort[3];
		     int[] arr=new int[3];
		 arr[0]=40;
		 arr[1]=20;
		 arr[2]=10;
         
		 Arrays.sort(arr);
         System.out.println(arr);

	}
}

