class SuperClass
{
    final void methodOne()
    {
        //final method
    }
 
    void methodOne(int i)
    {
        //final method can be overloaded
    }
}
 
class SubClass extends SuperClass
{
	public static void main(String[] args)
	{
	}
    @Override
    void methodOne(int i)
    {
        //Overloaded method can be overridden
    }
}