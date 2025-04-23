import java.util.Scanner;
class MethodCircumferenceCir
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the radious");
int r=sc.nextInt();
System.out.println(cir(r));


}
public static double cir(int x)
{
double cir=2*3.14*x;
return cir;
}
}