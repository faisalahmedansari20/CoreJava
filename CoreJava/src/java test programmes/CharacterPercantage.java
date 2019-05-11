import java.text.*;

public class CharacterPercantage
{
 static void charpercentage(String str)
 {
   int total=str.length();
   int uppercase=0;
   int lowercase=0;
   int digit=0;
   int others=0;

   for(int i=0;i<str.length();i++)
   {
    char ch=str.charAt(i);
    if(Character.isUpperCase(ch))
    {
      uppercase++;
      }
    else if(Character.isLowerCase(ch))
    {
       lowercase++;
       }
      else if(Character.isDigit(ch))
      {
       digit++;
       }
       else
       {
         others++;
	 }


}
double uppercaseletterpercentage=(uppercase*100)/total;
double lowercaseletterpercentage=(lowercase*100)/total;
double digitpercentage=(digit*100)/total;
double otherpercentage=(others*100)/total;

DecimalFormat format=new DecimalFormat("##.##");

System.out.println("uppercaseletter are :"+format.format(uppercaseletterpercentage)+" %");
System.out.println("lowercaseletter are :"+format.format(lowercaseletterpercentage)+" %");
System.out.println("digits are :"+format.format(digitpercentage)+" %");
System.out.println("other percentage are :"+format.format(otherpercentage)+" %");

 }

public static void main(String[] args)
{
  charpercentage("India is my country 100%"); 
}

}

	

      
