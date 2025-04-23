import java.util.Scanner;
class MainPtr10
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE OF N:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
 for(int j=1;j<=i;j++)
  {
   System.out.print(i%2+"");
  }
System.out.println();
}
}
}