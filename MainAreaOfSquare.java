import java.util.Scanner;
class MainAreaOfSquare
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the side of a square:");
int s=sc.nextInt();
int area=s*s;
int peri=s*s*s*s;
System.out.println("Area of a Square is: "+area);
System.out.println("Perimeter of a Square is: "+peri);
}
}