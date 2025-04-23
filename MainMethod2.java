import java.util.Scanner;
class MainMethod2
{
public static boolean recerseOfNum(int n)
{
int rev=0,temp=n;
while(n>0)
{
int d=n%10;
rev=rev*10+d;
n=n/10;
}
if(rev==temp)
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
boolean rs=recerseOfNum(num);
if(rs==true)
{
System.out.println("number is palindrome");
}
else
{
System.out.println("number is not palindrome");
}
}
}