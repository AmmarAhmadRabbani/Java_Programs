import java.util.Scanner;
class Num3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENETR THREE NUMBERS");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println(add(a,b,c));
System.out.println(mul(a,b,c));
System.out.println(div(a,b,c));
System.out.println(sub(a,b,c));
}
public static int add(int x,int y,int z)
{
int w=x+y+z;
return w;
}
public static int mul(int x,int y,int z)
{
int w=x*y*z;
return w;
}
public static int div(int x,int y,int z)
{
int w=x/y/z;
return w;
}
public static int sub(int x,int y,int z)
{
int w=x-y-z;
return w;
}
}
