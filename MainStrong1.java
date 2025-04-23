import java.util.Scanner;
class MainStrong1
{
static int factorial(int n)
{
int fact=1;
while(n>0)
{
fact=fact*n;
n--;
}
return fact;
}

static boolean isStrong(int x)
{
int sum=0,temp=x;
while(x>0)
{
int d=x%10;
sum=sum+factorial(d);
x=x/10;
}
return sum==temp;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isStrong(num);
if(rs==true)
System.out.println("NUMBER IS A STRONG NUMBER");
else
System.out.println("NUMBER IS NOT A STRONG NUMBER");
}
}