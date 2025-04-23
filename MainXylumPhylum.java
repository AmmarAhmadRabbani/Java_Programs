import java.util.Scanner;
class MainXylumPhylum
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
if(ms==es)
return "xylum";
else
return "phylum";
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
String st=isXylum(num);
if(st=="xylum")
System.out.println(num+" NUMBER IS XYLUM");
else
System.out.println(num+" NUMBER IS PHYLUM");
}
}

