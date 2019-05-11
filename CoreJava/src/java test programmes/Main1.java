class Table
{
synchronized public void print(int n)
 {
  for(int i=1;i<10;i++)
  {
   System.out.println(" = "+n*i);
   try
    {
     Thread.sleep(2000);
     }
     catch(Exception e)
     {
      System.out.println(e);
      }
      }
}
}

class A extends Thread
{
 Table t;
  A(Table t)
  {
   this.t=t;
   }
   public void run()
   {
    t.print(5);
    }
}

class B extends Thread
{
 Table t;
 B(Table t)
 {
  this.t=t;
  }
  public void run()
  {
   t.print(100);
   }
   }

   class Main1
   {
    public static void main(String[] args)
    {
     Table obj=new Table();
     A t1=new A(obj);
     B t2=new B(obj);
     
     t1.start();
     t2.start();
     }
     }





    
  