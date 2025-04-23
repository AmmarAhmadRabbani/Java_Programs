import java.util.Scanner;
class MethodNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
num(a);
}
public static void num(int x)
{
if(x==0)
{
System.out.println("number is zero");
}
else if(x>0)
{
System.out.println("number is positive");
}
else
{
System.out.println("number is negative");
}
}
}
