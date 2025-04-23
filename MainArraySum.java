import java.util.Scanner;
class MainArraySum
{
public static int sumOfArray(int num[])
{
int sum=0;
for(int i=0;i<num.length;i++)
{
sum=sum+num[i];
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("ENTER"+n+"VALUES:");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
int total=sumOfArray(ar);
System.out.println(total);
}
}