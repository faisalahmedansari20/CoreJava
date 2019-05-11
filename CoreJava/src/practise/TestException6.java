import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException6 {

	public static void main(String[] args) {
		try {
			foo();
		}  catch (ArithmeticException   e) {
			 new Exception("dfdf");
			e.printStackTrace();
		}catch(Exception e){
			e = new Exception("");
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException, JAXBException{
		
	}
}


