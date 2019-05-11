public class TestEmp1
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		System.out.println("Overridden hashCode()--->>>"+emp1.hashCode());
		int originalHashCode = System.identityHashCode(emp1); // identityHashCode
		System.out.println("Original hashCode of Emp---->>>"+originalHashCode);
	}
}