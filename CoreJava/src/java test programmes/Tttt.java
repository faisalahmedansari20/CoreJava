class Tttt implements Runnable
{
 public void run()
 {
	 String s=Thread.currentThread().getName();
   System.out.println(s);
  }
  public static void main(String[] args)
  {
   Tttt t=new Tttt();
   Thread tt=new Thread(t);
//     tt.setPriority(1);
  // System.out.println(tt);
    tt.start();
    }
   }
