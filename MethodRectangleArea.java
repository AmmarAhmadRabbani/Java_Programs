import java.util.Scanner;
class MethodRectangleArea
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER LENGTH OF A RECTANGLE");
int length=sc.nextInt();
System.out.println("ENTER THE BREADTH OF A RECTANGLE");
int breadth=sc.nextInt();
System.out.println(area(length,breadth));
}
public static int area(int x,int y)
{
 int area=x*y;
return area;
}}
