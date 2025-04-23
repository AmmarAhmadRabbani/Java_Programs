import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the operation-+*/");
String s=sc.nextLine();
System.out.println("enter 1st number");
int a=sc.nextInt();
System.out.println("enter the 2nd number");
int b=sc.nextInt();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch=='+')
{
int c=a+b;
System.out.println("addition is"+c);
}
else if(ch=='-')
{
int d=a-b;
System.out.println("substraction is"+d);
}
else if(ch=='*')
{
int e=a*b;
System.out.println("multiplication is"+e);
}
else if(ch=='/')
{
int f=a/b;
System.out.println("division is"+f);
}
}
}
}
