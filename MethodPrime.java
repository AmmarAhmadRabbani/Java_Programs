import java.util.Scanner;
class MethodPrime
{
public static void main(String[] args)
{
System.out.println("ENTER A NUMBER");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
pri(a);
}


public static void pri(int n)
{
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println("nt PRIME");
return;
}
}
System.out.println("prime");


}
}
