import java.util.Scanner;
class MainPerfectNum
{
public static boolean isPerfect(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
if(sum==n)
{
return true;
}
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isPerfect(num);
if(rs==true)
System.out.println("NUMBER IS A PERFECT NUMBER");
else
System.out.println("NUMBER IS NOT A PERFECT NUMBER");
}
}