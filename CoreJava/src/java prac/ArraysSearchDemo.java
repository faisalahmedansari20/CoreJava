import java.util.*;
import java.util.Arrays;

class ArraysSearchDemo
{
	public static void main(String[] args)
	{
		int[] a={10,5,20,11,6};
		System.out.println("default insertion ");
		for(int i:a)
		{
			System.out.print(" "+i);
		}
         System.out.println();
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a,6));
		System.out.println(Arrays.binarySearch(a,14));

         String[] s={"A","Z","B"};
		 System.out.println("before sorting the elements");
		 for(String si:s)
		{
			 System.out.print(si+" ");
		}
		Arrays.sort(s);
		System.out.println("after sorting the elements");
		for(String si:s)
		{
			System.out.print(si+" ");
	     }
		 System.out.println(Arrays.binarySearch(s,"Z"));
		 System.out.println(Arrays.binarySearch(s,"S"));
		 Arrays.sort(s,new MyComparator());
		 
		 System.out.println("After sorting the elements by comparatorr");
         System.out.println(Arrays.binarySearch(s,"Z",new MyComparator()));
         System.out.println(Arrays.binarySearch(s,"S",new MyComparator()));
         System.out.println(Arrays.binarySearch(s,"N"));

}
}
