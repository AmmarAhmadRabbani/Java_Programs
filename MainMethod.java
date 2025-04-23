import java.util.Scanner;
class MainMethod
{
public static int countDivisors(int n)
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
return count;
}
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int c1=countDivisors(n);
System.out.println(c1);
}
}