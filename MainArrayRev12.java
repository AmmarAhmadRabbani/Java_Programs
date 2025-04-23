import java.util.Scanner;
class MainArrayRev12
{
static int searchEle(int a[],int elem)
{
for(int i=0;i<a.length;i++)
{
if(a[i]==elem)
retun a[i];
return -1;
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
System.out.println("before update:");
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
int rec=searchEle(ar);
System.out.println(rec);
}
}
