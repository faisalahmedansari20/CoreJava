import java.util.function.Consumer;

class Counsume
{
	public static void main(String[] args)
	{
		Consumer<String> c=s.->System.out.prinltn(s);
		c.accept("Hello");
		c.accept("String");
	}
}