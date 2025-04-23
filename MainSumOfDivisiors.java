import java.util.Scanner;
class MainSumOfDivisiors
{
public static int sumOfDivisiors(int n)
{
int sum=0;
for (int i=1;i<=n/2;i++)
{
if(n%i==0)
sum=sum+i;
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int sum=sumOfDivisiors(num);
System.out.println("SUM OF DIVISIORS OF A NUMBER IS:"+sum);
}
}