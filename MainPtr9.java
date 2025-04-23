import java.util.Scanner;
class MainPtr9
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE OF N");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
 {
  for(int j=i;j<=i;j--)
   {
    System.out.print(j+"");
   }
  System.out.println();
 }
}
}