import java.util.Scanner;
class MainDiserium1
{
public static int countDigit(int n)
{
int count=0;
while(n>0)
{
count++;
n=n/10;
}
return count;
}
public static int power(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}
public static boolean isDiserium(int n)
{
int dc=countDigit(n);
int sum=0,temp=n;
while(n>0)
{
int d=n%10;
sum=sum+power(d,dc);
n=n/10;
}
return temp==sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isDiserium(num);
if(rs==true)
System.out.println("NUMBER IS DISERIUM");
else
System.out.println("NUMBER IS NOT A DISERIUM");
}
}