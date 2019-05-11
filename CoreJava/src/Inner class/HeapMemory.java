class HeapMemory
{
	public static void main(String[] args)
	{ 
//		int mb=1024*1024;
		double mb=1024*1024;

		Runtime r=Runtime.getRuntime();
		System.out.println("max Memory :"+r.maxMemory()/mb+"mb");
		System.out.println("total Memory :"+r.totalMemory()/mb+"mb");
		System.out.println("free  Memory :"+r.freeMemory()/mb+"mb");
		System.out.println("consumed  Memory :"+((r.totalMemory()-r.freeMemory())/mb)+"mb");
	}

}