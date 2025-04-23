import java.util.Scanner;
class MainPrimeNum
{
public static boolean isPrime(int num)
{
for(int i=1;i<num;i++)
{
if(num%i==0)
{
return false;
}
}
return true;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number :");
int num=sc.nextInt();
boolean rs=isPrime(num);
if(rs==true)
{
System.out.println("number is prime number");
}
else
{
System.out.println("number is not a prime number");
}
}
}