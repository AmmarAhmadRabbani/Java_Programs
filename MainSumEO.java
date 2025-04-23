import java.util.Scanner;
class MainSumEO
{
public static void sumOfEO(int num)
{
int se=0,so=0;
for(int i=1;i<=num;i++)
{
if(i%2==0)
{
se=se+i;
}
else
{
so=so+i;
}
}
System.out.println("sum of even numbers: "+se);
System.out.println("sum of odd numbers: "+so);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
sumOfEO(num);
}
}
