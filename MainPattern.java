import java.util.Scanner;
class MainPattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUR OF N:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<0;j--)
{
System.out.print(j+"");
}
System.out.println();
}
}
}