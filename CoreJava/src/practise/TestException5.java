import java.io.IOException;

 class TestException4 {

	public void start() throws RuntimeException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}

class TestException5 extends TestException4{
	
	public void start() throws Exception{
	}
	
	public void foo() throws RuntimeException{
		
	}
	public static void main(String[] args)
	{

	}
}