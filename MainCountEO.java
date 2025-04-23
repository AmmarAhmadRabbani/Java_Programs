import java.util.Scanner;
class MainCountEO
{
public static void printEO(int num)
{
int ce=0,co=0;
while(num>0)
{
int d=num%10;
if(d%2==0)
{
ce++;
}
else
{
co++;
}
}
System.out.println("NUMBER OF EVEN:"+ce);
System.out.println("NUMBER OF ODD:"+co);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
printEO(num);
}
}