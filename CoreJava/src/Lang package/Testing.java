class Testing
{
	int j;

   Testing(int j)
	{
	   this.j=j;
	}
}
	class Clo implements Cloneable
	{
		Testing t;
		int i;

		Clo(Testing t,int i)
		{
			this.t=t;
			this.i=i;
		}
		public Object clone()throws CloneNotSupportedException
		{
//			System.out.println("i="+i);
			Testing t1=new Testing(t.j);
			Clo clo2=new Clo(t1,i);
          return clo2;
		}
	}

		class DeepCloning
		{
			public static void main(String[] args)throws CloneNotSupportedException
			{
	          Testing t=new Testing(10);
			  Clo clo1=new Clo(t,20);
//		      System.out.println("i="+clo1.i+"  j="+clo1.t.j);
			  Clo clo3=(Clo)clo1.clone();

			  clo3.i=40;
			  clo3.t.j=100;
			  System.out.println("clo3.t.j="+clo3.t.j+"  clo.t.j="+clo1.t.j);
        
			  


		
		
		}
	}
