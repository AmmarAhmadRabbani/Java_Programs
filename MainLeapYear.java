import java.util.Scanner;
class MainLeapYear
{
public static boolean MainMiddleVlaue(int year)
{
if(year%4==0 && year %100!=0 || year%400==0)
return true;
else 
return false;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE YEAR:");
int year=sc.nextInt();
boolean rs=MainMiddleVlaue(year);
if(rs==true)
System.out.println("YEAR IS LEAP YEAR");
else
System.out.println("YEAR IS NOT A LEAP YEAR");
}
}