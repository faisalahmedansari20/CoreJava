class TimeConsume
{
 public static void main(String[] args)
 {
  long starttime=System.currentTimeMillis();

  for(int i=1;i<=1000000;i++)
  {
   String s="wakeel";
   String s1="wakeel";
  }
  long endtime=System.currentTimeMillis();
  System.out.println("Time Taken By String : "+(endtime-starttime)+" ms");
  
  long starttime1=System.currentTimeMillis();

  for(int k=1;k<=100000;k++)
  {
   String sk=new String("wakeel");
   String sk1=new String("wakeel");
   }
   long endtime1=System.currentTimeMillis();

   System.out.println("Time Taken By newString :"+(endtime1-starttime1)+" ms");
 }
}