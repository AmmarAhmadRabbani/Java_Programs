import java.util.Scanner;
class mainArrayyy
{
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
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
int a[]={12,34,55,22,44};
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
for(int j:a)
{
System.out.print(j);
}
}
}
