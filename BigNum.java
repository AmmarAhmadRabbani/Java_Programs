import java.util.Scanner;
class BigNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THREE NUMBERS");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int big=x;
if(y>big)
{
big=y;
}
if(z>big)
{
big=z;
}
System.out.println("BIGGER NUMBER IS:"+big);
}
}