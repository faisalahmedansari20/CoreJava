import  java.util.*;
 class Missing
 {
	 public static void main(String[] args)
	 {
		 int[] arr={1,2,4,5,6};
         int miss=missingn(arr,6);
         System.out.println("the missing no in array is "+miss);
	 }
	 public static int missingn(int[] arr,int n)
	 {
		 int sum=0;
		 int expectsum=(n*(n+1)/2);
		 for(int i:arr)
		 {
			 sum+=i;
		 }
		 return expectsum-sum;
	 }
 }















