import java.util.Scanner;
class MainArray5_
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] ar=new int[5];
int avg=0;
//data from user
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
//average of element
for(int i=0;i<ar.length;i++)
{
avg=avg+ar[i];
}
System.out.println(avg/2);
}
}