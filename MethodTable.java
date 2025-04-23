import java.util.Scanner;
class MethodTable
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
table(a);

}
public static void table( int n)
{
for(int i=1; i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}