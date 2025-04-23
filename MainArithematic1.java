import java.util.Scanner;
class MainArithematic1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE FIRST NUMBER:");
int a=sc.nextInt();
System.out.println("ENTER THE SECOND NUMBER:");
int b=sc.nextInt();
System.out.println("SUM IS:"+a+b);//wrong answer
System.out.println("SUM IS:"+(a+b));
System.out.println(a+b+"SUM IS");
System.out.println("DIFFERENCE IS:"+(a-b));
System.out.println("PRODUCT IS:"+a*b);
System.out.println("DIVESION IS:"+a/b);
System.out.println("MODULO IS:"+a%b);
}
}