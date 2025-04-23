import java.util.Scanner;
class MainPtr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print((char)(j+64)+"");
}
System.out.println();
}
}
}