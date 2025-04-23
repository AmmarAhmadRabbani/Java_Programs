import java.util.Scanner;
class MethodAreaCircle
{
public static void main(String[] ars)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter radious");
int r=sc.nextInt();
System.out.println(area(r));

}
public static double area(int x)
{

 double area= 3.14*x*x;
return area;
}
}