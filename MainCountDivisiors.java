import java.util.Scanner;
class MainCountDivisiors
{
public static int countDivisiors(int n)
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int c=countDivisiors(num);
System.out.println("NUMBER OF DIVISIORS ARE:"+c);
}
}