import java.util.Scanner;
class MainArray3
{
public static int countPrimenumberOfAray(int x[])
{
int count=0;
for(int i=0;i<x.length;i++)
{
if(x[i]==1||x[i]==2||x[i]==3||x[i]==5||x[i]==7)
count++;
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
int count=countPrimenumberOfAray(ar);
System.out.println(count);
}
}