public class SmallestNumberInTheArray {

	public static void main(String[] args)
	{
		int[] arr= {12,34,3,67,23,90};
		
		int temp=arr[0];
		int x=0;
		int small=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				x++;
				temp=arr[i];
				
				if(x==2)
				{
					System.out.println("the second smallest number in the array is "+temp);
				}
			}
		}
//		System.out.println("the second smallest number in the array is "+small);
	}
}
