import java.util.Scanner;
class MainRectanglePro
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length and breadth of a rectangle:");
int length=sc.nextInt();
int breadth=sc.nextInt();
int area=length*breadth;
int peri=2*(length+breadth);
System.out.println("area of a rectangle:"+area);
System.out.println("perimeter of a rectangle:"+peri);
}
}
