import java.util.Scanner;
class MainAverageOfDigits
{
public static double average(int n)
{
int count=0;
double sum=0;
while(n>0)
{
count++;
sum=sum+n%10;
n=n/10;
}
return sum/count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
double d=average(num);
System.out.println(d);
}
}
