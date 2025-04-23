import java.util.Scanner;
class MainEO
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the month number:");
int num=sc.nextInt();
int d1=num%10;
int d2=num/10;
int sum=d1+d2+d1*d2;
if(sum==num)
{
System.out.println(num+":is special two digit number");
}
else
{
System.out.println(num+":is not a special two digit number");
}
}
}