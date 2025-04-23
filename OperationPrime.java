import java.util.Scanner;
class OperationPrime
{
int[] readArray()
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
return ar;
}
void display(int ar[])
{
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
}
int countPrimeNum(int ar[])
{
int count=0;
for(int i=0;i<ar.length;i++)
{
if(ar[i]==1||ar[i]==2||ar[i]==3||ar[i]==5||ar[i]==7)
{
count++;
}
return count;
}
}
}