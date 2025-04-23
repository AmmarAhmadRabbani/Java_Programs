import java.util.Scanner;
class MainMiddleVlaue
{
public static int middleValue(int a,int b,int c)
{
if(a>b && a<c)
return c;
else if(b>a && b<c)
return b;
else
return c;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE THREE INTEGERS :");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int rec=middleValue(x,y,x);
System.out.println(rec+":IS MIDDLE VALUE");
}
}
