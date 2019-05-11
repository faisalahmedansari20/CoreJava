public class Test {

	 public void foo(String s) {
	 System.out.println("String");
	 }

	 public void foo(Object sb){
	 System.out.println("Object	");
	 }

	 public static void main(String[] args) {
		new Test().foo("yes");
	}

}