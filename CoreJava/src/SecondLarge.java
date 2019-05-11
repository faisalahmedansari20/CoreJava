import java.util.Arrays;
class SecondLarge
{
	public static void main(String[] args)
	{
        int[] a={2,34,1,80,100,23};
        
		for(int p=0;p<a.length;p++)
		{
			System.out.print(" "+a[p]);
			}
					System.out.println(" ");

		 int temp;
		 for(int i=0;i<a.length;i++)
		{
			 for(int k=i+1;k<a.length;k++)
			{
				 if(a[k]>a[i])
				{
					 temp=a[k];
					 a[k]=a[i];
                     a[i]=temp;
				}
	}
		}
						System.out.println("Second large number "+a[1]);
           
		   for(int o=0;o<a.length;o++)
		{
			   System.out.print(" "+a[o]);
		}

     int[] arr={2,34,1,3,44,32,23};
	 Arrays.sort(arr);
	 	 System.out.println(" ");
	 System.out.println("Second largest number is "+arr[arr.length-2	]);
}
}