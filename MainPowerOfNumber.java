import java.util.Scanner;
class MainPowerOfNumber
{
public static int powerOfNumber(int n,int p)
{
int pow=1;
while(p>0)
{
pow=pow*n;
p--;
}
return pow;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER AND POWER:");
int num=sc.nextInt();
int pw=sc.nextInt();
int pwr=powerOfNumber(num,pw);
System.out.println(pwr);
}
}