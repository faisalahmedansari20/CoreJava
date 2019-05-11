public class SuperClass {  
    public void start() throws IOException{
        throw new IOException("Not able to open file");
    }
}

public class SubClass extends SuperClass{  
    public void start() throws IOException{
        throw new Exception("Not able to start");
    }
	public static void main(String[] args)
	{
       SuperClass obj=new SubClass();
	   obj.start();

	}
}


