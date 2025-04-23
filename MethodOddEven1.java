import java.util.Scanner;
class MethodOddEven1
{
public static void main(String[] args)
{
System.out.println("ENTER A NUMBER");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
boolean rs=num(a);

if(rs==true)
{
System.out.println("EVEN");
}
else
{
System.out.println("ODD");
}

}


public static boolean num(int n)
{
if(n%2==0)
{
return true;
}
else
{
return false;
}
}
}