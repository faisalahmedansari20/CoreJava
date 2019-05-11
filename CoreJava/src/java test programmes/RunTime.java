class RunTime
{
   public	RunTime()
	{
	   System.out.println(this);

	}
 public static void main(String[] args)
 {
	 RunTime r1=new RunTime();
  Runtime r=Runtime.getRuntime();
  System.out.println(r);

  }
}

