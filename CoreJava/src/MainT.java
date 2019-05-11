class T
{
	int k=4;

	T(int z)
	{
		this.k=z;
	}
}

public class MainT
{
	public static void main(String[] args)
	{
		T obj1=new T(40);
		T obj2=new T(400);

		System.out.println(obj1.k);
		System.out.println(obj2.k);

		obj1=obj2;
        
		System.out.println("after ="+obj1.k);
		System.out.println("after ="+obj2.k);

	}

}