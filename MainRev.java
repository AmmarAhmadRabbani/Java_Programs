import java.util.Scanner;
class MainRev
{
public static int reverse(int num)
{
int rev=0;
while(num>0)
{
int d=num%10;
rev=rev*10+d;
num=num/10;
}
return rev;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int rev=reverse(num);
System.out.println("REVERSE OF "+num+": IS "+rev);
}
}