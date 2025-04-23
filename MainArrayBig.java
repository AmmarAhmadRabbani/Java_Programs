import java.util.Scanner;
class MainArrayBig
{
static int getSmall(int a[])
{
int small=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<small)
small=a[i];
}
return small;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array:");
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
int x=getSmall(ar);
System.out.println("smallest element is :"+x);
}
}