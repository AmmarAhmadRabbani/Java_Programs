import java.util.Scanner;
class MainArrayRev
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of first array:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter"+n+"values");
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
System.out.println("enter the size of second array:");
int m=sc.nextInt();
int ar1[]=new int[m];
System.out.println("enter"+m+"values");
for(int i=0;i<m;i++)
ar1[i]=sc.nextInt();
int ar2[]=new int[ar.length+ar1.length];
System.out.println("elements of merged array:");
for(int i=0;i<ar2.length;i++)
System.out.print(ar2[i]+" ");
}
}




