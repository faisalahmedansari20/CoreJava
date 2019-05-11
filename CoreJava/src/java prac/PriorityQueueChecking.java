import java.util.*;

class PriorityQueueChecking
{
	public static void main(String[] args)
	{
//		Queue q=new PriorityQueue();
		Queue q=new PriorityQueue(new MyPriorComp());

		System.out.println(q);
		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		q.offer("malik");
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q);
    }
}

class MyPriorComp implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;

		return i2.compareTo(i1);
	}

}