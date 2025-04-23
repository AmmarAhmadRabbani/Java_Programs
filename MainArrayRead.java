import java.util.Scanner;
class MainArrayRead
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
System.out.println("user entered alement from first to last elements:");
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+"");
}
System.out.println("user entered elements from last to first:");
for(int i=ar.length-1;i>=0;i++)
{
System.out.print(ar[i]+"");
}
}
}