import java.util.Scanner;
class MethodPrime1
{
public static int countPrimeDigits(int n)
{
int count=0;
while(n!=0)
{
int d=n%10;
if(d==1||d==2||d==3||d==5||d==7)
{
count ++;
}
n=n/10;
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int num=countPrimeDigits(a);
System.out.println(num);
}
}




