import java.util.Scanner;
class MainPosNeg
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
if(num>0)
{
System.out.println("number is Positive");
}
else
{
System.out.println("number is Negative");
}
}
}