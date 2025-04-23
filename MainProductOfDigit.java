import java.util.Scanner;
class MainProductOfDigit
{
public static int productOfDigit(int num)
{
int product=1;
while(num>0)
{
int d=num%10;
product=product*d;
num=num/10;
}
return product;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int pd=productOfDigit(num);
System.out.println(pd);
}
}
