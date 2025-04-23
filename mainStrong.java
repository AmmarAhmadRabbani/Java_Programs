import java.util.Scanner;
class mainStrong
{
int getFact(int x)
{
int fact=1;
while(x>0)
{
fact=fact*x;
x--;
}
return fact;
}
boolean isStrong(int n)
{
int sum=0,temp=n;
while(n>0)
{
int d=n%10;
sum=sum+getFact(d);
n=n/10;
}
return sum==temp;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE OF N:");
int n=sc.nextInt();
boolean rs=isStrong(n);
if(rs==true)
{
System.out.println("STRONG");
}
else
{
System.out.println("NOT A STRONG");
}
}
}