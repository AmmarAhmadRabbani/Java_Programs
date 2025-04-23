import java.util.Scanner;
class MainSumOfSquare
{
public static int sumOfSquare(int num)
{
int sum=0;
while(num>0)
{
int d=num%10;
sum=sum+d*d;
num=num/10;
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int sqr=sumOfSquare(num);
System.out.println("sum of square of digits:"+sqr);
}
}
