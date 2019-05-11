interface Test7 {

	public void mk();
}

class Main2 implements  Test7
{
	@Override
	public void mk() {
		
		System.out.println("in the mk method of Test7");
	}
	
}
