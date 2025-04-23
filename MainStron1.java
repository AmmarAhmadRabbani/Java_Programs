import java.util.Scanner;
class MainStron1
{
public static int returnFact(int n)
{
int fact=1;
while(n!=0)
{
fact=fact*n;
n--;
}

return fact;
}
public static boolean returnStrong(int n)
{
int sum=0,temp=n;
while(n>0)
{
int d=n%10;
sum=sum+returnFact(d);
n=n/10;
}
return sum==temp;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
boolean rs=returnStrong(n);
if(rs==true)
{
System.out.println("number is armstrong");
}
else 
{
System.out.println("number is not a armstrong ");
}
}
}