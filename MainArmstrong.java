import java.util.Scanner;
class MainArmstrong
{
public static String isXylum(int n)
{
int es=0,ms=0;
es=es+n%10;
n=n/10;
while(n>9)
{
ms=ms+n%10;
n=n/10;
}
es=es+n;

if(es==ms)
{
return "xylum";
}
else
{
return "phylum";
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
String st=isXylum(n);
if(st=="xylum")
{
System.out.println("xylum");
}
else
{
System.out.println("phylum");
}
}
}