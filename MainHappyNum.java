import java.util.Scanner;
class MainHappyNum
{
public static boolean isHappy(int n)
{
while(n>9)
{
int sum=0;
while(n>0)
{
int d=n%10;
sum=sum+d*d;
n=n/10;
}
n=sum;
}
return n==1||n==7;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isHappy(num);
if(rs==true)
System.out.println("NUMBER IS HAPPY NUMBER");
else
System.out.println("NUMBER IS NOT A HAPPY NUMBER");
}
}