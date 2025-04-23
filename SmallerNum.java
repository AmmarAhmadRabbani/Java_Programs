import java.util.Scanner;
class SmallerNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a<b && a<c)
{
System.out.println("number is smaller"+a);
}
if(b<a && b<c)
{
System.out.println("number is smaller"+b);
}
else
{
System.out.println("number is smaller"+c);
}
}
}