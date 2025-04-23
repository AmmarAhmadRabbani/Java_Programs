import java.util.Scanner;
class MainArrayee
{
static int search(int x[],int ele)
{
for(int i=0;i<x.length;i++)
{
if(x[i]==ele)
return i;
}
return -1;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE SIZE OF AN ARRAY:");
int a=sc.nextInt();
int ar[]=new int[a];
System.out.println("ENTER"+a+"VALUES:");
for(int i=0;i<a;i++)
ar[i]=sc.nextInt();
System.out.println("ENTER THE ELEMENT TO SEARCH:");
int elm=sc.nextInt();
int n=search(ar,elm);
if(n==-1)
{
System.out.println("ELEMENT IS NOT PRESENT");
}
else
{
System.out.println("ELEMENT IS PRESENT");
}
}
}