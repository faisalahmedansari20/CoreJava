public class Test {

	public void foo(Object o) {
		System.out.println("Object");
	}

//	public void foo(String s) {
//		System.out.println("String");
//	}

	public void foo(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		new Test().foo(null);
	}

}