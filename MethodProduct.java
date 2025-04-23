import java.util.Scanner;
class MethodProduct
{
public static int productOfDigits(int n)
{
int product=1;
while(n!=0)
{
int d=n%10;
product=product*d;
n=n/10;
}
return product;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a digits");
int a=sc.nextInt();
int num=productOfDigits(a);
System.out.println(num);
}
}