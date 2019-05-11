import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("insert number");
		int i=sc.nextInt();

		int  cnteven=0,cntodd=0,sumodd=0,sumeven=0;

				while(i>0)
		{
			if (i%2==0) {
				cnteven++;
				sumeven=sumeven+i;
			}
			else {
				cntodd++;
				sumodd=sumodd+i;
			}
			i--;
		}
				int Avgeven,Avgodd;
				
				Avgeven=sumeven/cnteven;
				Avgodd=sumodd/cnteven;
				
				System.out.println("avgeven="+Avgeven+" avgodd="+Avgodd);
	}
}
