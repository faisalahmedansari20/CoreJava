package march23;
import java.util.Scanner;


public class Input1 {




	public static int sum(int x , int y) {
		return x+y;
	
	}	
	public static void main(String[] args)
	{
		Scanner scanner =new  Scanner(System.in);
		System.out.println("please enter vlue");
		int nextInt = scanner.nextInt();
		System.out.println("please enter vlue");
		int nextInt2 = scanner.nextInt();
         Input1 i=new Input1();
         i.sum(nextInt2, 4);
		System.out.println(sum(nextInt, nextInt2));
		
	}
}
		// TODO Auto-generated method stub

	
