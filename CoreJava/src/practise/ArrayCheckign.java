class ArrayCheckign
{
	public static void main(String[] args)
	{
		int[] arr={33,56,2,78,2,99,1,};
        int length=arr.length;
//        System.out.println(length);
		for(int i=0;i<length;i++)
		{
			System.out.print(" "+arr[i]);
		}
         int temp=0;
        for(int k=(length-1);k>=0;k--)
		{
			for(int j=1;j<length;j++)
			{
				if(arr[j-1]>=arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println();
		for(int s=0;s<length;s++)
		{
			System.out.print(" "+arr[s]);
		}
	}
}