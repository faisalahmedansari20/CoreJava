class Recur
{
	static  int i=1;
 public static void mk(int a)
 {
  if(a<11)
  {
    System.out.print(" "+a);
   
     a++;
     mk(a);
     }
}

public static void main(String[] args)
{ 
 mk(i);
 }
 }
