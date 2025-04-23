import java.util.Scanner;
class MainSmallestAmongThree
{
public static double isSmallest(double a,double b,double c)
{
double smallest=a;
if(b<smallest)
{
smallest=b;
}
else if(c<smallest)
{
smallest=c;
}
return smallest;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE THREE DOUBLE VALUE:");
double x=sc.nextDouble();
double y=sc.nextDouble();
double z=sc.nextDouble();
double d=isSmallest(x,y,z);
System.out.println(d+":IS THE SMALLEST VALUE");
}
}