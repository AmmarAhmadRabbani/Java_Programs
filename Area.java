import java.util.Scanner;
class Area
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the radious");
double r=sc.nextDouble();
double area=3.14*r*r;
double par=2.0*3.14*r;
System.out.println("area of circle"+area);
System.out.println("perimeter of circle"+par);
}
}

