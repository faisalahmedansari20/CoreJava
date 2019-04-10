package com.par;



interface CustomerFacade
{
    public void m1();
}
interface AMCCustomerFacade extends CustomerFacade
{
	public void m2();
}

class DefaultCustomerFacade implements CustomerFacade
{

	@Override
	public void m1() {
		System.out.println("in m1 DefaultCustomerFacade");
	}
	
}
class DefaultAMCCustomerFacade extends DefaultCustomerFacade implements AMCCustomerFacade
{

	@Override
	public void m2() {
		System.out.println("in m2 DefaultAMCCustomerFacade ");
	}
}

public class Test22 {

	public static void main(String[] args)
	{
		CustomerFacade customerFacade = new DefaultAMCCustomerFacade();
		customerFacade.m1();
		AMCCustomerFacade amcCustomerFacade = new DefaultAMCCustomerFacade();
		amcCustomerFacade.m2();
		
		CustomerFacade customerFacade2 = new DefaultCustomerFacade();
		
	}
}