import java.io.IOException;

public class TestException4 {

	public void start() throws IOException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}

class TestException5 extends TestException4{
	
	public void start() {
	}
	
	public void foo() throws RuntimeException{
		
	}
	public static void main(String[] args)
	{

	}
}