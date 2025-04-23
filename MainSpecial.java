import java.util.Scanner;
class MainSpecial
{
public static boolean isSpecialDigit(int num)
{
int d1=num%10;
int d2=num/10;
int sum=d1+d2+d1*d2;
if(num==sum)
return true;
else
return false;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rs=isSpecialDigit(num);
if(rs==true)
System.out.println(rs+":number is special two digit number");
else
System.out.println(rs+":number is not a special two digit number");
}
}