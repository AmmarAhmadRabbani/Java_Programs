import java.util.Scanner;
class MainMethod1
{
public static boolean isPerfectNum(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
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
System.out.println("ENTER THE VALUE OF N:");
int num=sc.nextInt();
boolean p1=isPerfectNum(num);
if(p1==true)
{
System.out.println(p1+"is a perfect number");
}
else
{
System.out.println(p1+"is not a perfect number");
}
}
}