import java.util.Scanner;
class GreaterNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("number is greater"+a);
}
if(b>a && b>c)
{
System.out.println("number is greater"+b);
}
else
{
System.out.println("number is greater"+c);
}
}
}