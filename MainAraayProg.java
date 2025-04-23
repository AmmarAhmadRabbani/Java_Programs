import java.util.Scanner;
class MainAraayProg
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("Enter"+n+"values");
for(int i=0;i<n;i++)
{
ar[]=sc.nextInt();
}
System.out.println("read the elements of an array");
for(int i=0;i<ar.length;i++)
{
System.out.println(ar[i]);
}
int max=ar[0];
for(int i=0;i<ar.length;i++)
{
if(ar[i]>ar[0])
{
max=ar[i];
}
}
System.out.println("maximum number is:"+max);
int min=ar[0];
for(int i=0;i<ar.length;i++)
{
if(ar[i]<ar[0])
{
min=ar[i];
}
}
System.out.println("minimum number is :"+min);
}
}