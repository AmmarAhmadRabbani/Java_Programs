import java.util.Scanner;
class MainArray111
{
public static int sumOfArray(int x[])
{
int sum=0;
for(int i=0;i<x.length;i++)
{
sum=sum+x[i];
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE SIZE OF AN ARRAY:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("ENTER"+n+"VALUES");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
int rec=sumOfArray(ar);
System.out.println("SUM OF ELEMENTS OF AN ARRAY IS:"+rec);
}
}

