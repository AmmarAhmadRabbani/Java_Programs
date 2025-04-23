import java.util.Scanner;
class MainDiffSmallBig
{
public static int diff(int n)
{
int big,small;
big=small=n%10;
while(n>0)
{
int d=n%10;
if(d>big)
big=d;
if(d<small)
small=d;
n=n/10;
}
return big-small;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int d=diff(num);
System.out.println(d);
}
}