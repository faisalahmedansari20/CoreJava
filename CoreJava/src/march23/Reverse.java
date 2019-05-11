package march23;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int no, rev=0, r, a;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter any no.:");
     no=s.nextInt();
     a=no;
     while(no>0)
     {r=no%10;
     rev = rev*10+r;
     no=no/10;
     
     }
     System.out.println("Reverse;"+rev);
     
     
	}

}
