class WhileChecking
{
 public static void main(String[] args)
 {
   int  i=1,j=1,val;
   while(i<25)
   {
    System.out.print(" : "+j);
    val=i+j;
    j=i;
    i=val;
    }
    }
}
