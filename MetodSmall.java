import java.util.Scanner;
class MetodSmall
{
public static int isMiddleValue(int x,int y,int z)
{
if(x>y && x<z)
{
return x;
}
else if (y>x && y<z)
{
return y;
}
else 
{
return z;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THREE INT VALUES");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=isMiddleValue(a,b,c);
System.out.println(d);
}
}