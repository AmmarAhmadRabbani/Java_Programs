import java.util.Scanner;
class MainWed
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE INTEGER VALUE FROM THE USER:");
int num=sc.nextInt();
if(num%3==0 && num%5==0)
System.out.println("SANJU WEDS GEETA");
else if(num%5==0)
System.out.println("GEETA");
else if(num%3==0)
System.out.println("SANJU");
else 
System.out.println("WRONG ENTERED");
}
}