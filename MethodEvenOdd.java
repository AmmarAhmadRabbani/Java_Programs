import java.util.Scanner;
class MethodEvenOdd
{
public static float reverse(float n)
{
float count=1,avg=0,sum=0;
while(n>0)
{
float d=n%10;
sum=sum+d;
count++;
n=n/10;
}
avg=count/sum;
return avg;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
float num=sc.nextFloat();
float re=reverse(num);
System.out.println(re);
}
}