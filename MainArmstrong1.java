import java.util.Scanner;
class MainArmstrong1
{
static int countDigit(int n)
{
int count=0;
while(n>0)
{
count++;
n=n/10;
}
return count;
}
static int power(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}
static boolean isArmstrong(int n)
{
int sum=0,temp=n;
int dc=countDigit(n);
while(n>0)
{
int d=n%10;
sum=sum+power(d,dc);
n=n/10;
}
return sum==temp;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isArmstrong(num);
if(rs==true)
System.out.println("NUMBER IS ARMSTRONG NUMBER");
else
System.out.println("NUMBER IS NOT A ARMSTRONG");
}
}
