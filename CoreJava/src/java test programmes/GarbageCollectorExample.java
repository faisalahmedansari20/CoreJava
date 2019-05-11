class GarbageCollectorExample
{
 public void finalize()
 {
  System.out.println("Object is garbej collected");
  }

  public static void main(String[] args)
  {
   GarbageCollectorExample gc=new GarbageCollectorExample();
   GarbageCollectorExample gc1=new GarbageCollectorExample();

   gc=null;
   gc1=null;

   System.gc();
   }
}