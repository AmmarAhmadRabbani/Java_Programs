import java.util.Scanner;
class MainArrayProd
{
static int productOfArray(int a[])
{
int prod=1;
for(int i=0;i<a.length;i++)
{
prod=prod*a[i];
}
return prod;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter"+n+"values");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("entered array elements are:");
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
int p=productOfArray(ar);
System.out.println("product of an array is:"+p);
}
}