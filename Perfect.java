import java.util.Scanner;
class Perfect
{
public static boolean isNumPerfect(int n)
{
int sum=0;
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
{
sum=sum+i;
return true;
}
else 
return false;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER");
int num=sc.nextInt();
boolean rs=isNumPerfect(num);
if(rs==true)
{
System.out.println(num+"is a perfect number");
}
else
{
System.out.println(num+"is not a perfect number");
}
}
}