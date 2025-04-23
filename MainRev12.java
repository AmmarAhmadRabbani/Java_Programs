import java.util.Scanner;
class MainRev12
{
static int reverse(int n)
{
int rev=0;
while(n>0)
{
int d=n%10;
rev=rev*10+d;
n=n/10;
}
return rev;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int rec=reverse(num);
System.out.println("REVERSE OF A NUMBER IS: "+rec);
}
}