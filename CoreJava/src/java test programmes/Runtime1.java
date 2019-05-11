class Runtime1
{
public static void main(String[] args)
{
 System.out.println("Program Starting ");

 Runtime r=Runtime.getRuntime();

System.out.println(" "+r.totalMemory());
 System.out.println(" "+r.freeMemory());
 }
}