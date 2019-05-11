import java.util.Scanner;
class Reverse 
{
public static void main(String[] args) 
{
int no=23763,rev=0,r,a;
a=no;
while(no>0)
{
r=no%10;
rev=rev*10+r;
no=no/10;
}
System.out.println("Reverse: "+rev);
}
}