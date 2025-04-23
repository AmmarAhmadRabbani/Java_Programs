import java.util.Scanner;
class MethodSum
{
public static int sumSquare(int n)
{
int sum=0;
while(n!=0)
{
int d=n%10;
sum=sum+d;
n=n/10;
}
sum=sum*sum;
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the digits");
int a=sc.nextInt();
int num=sumSquare(a);
System.out.println(num);
}
}