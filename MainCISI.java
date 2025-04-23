import java.util.Scanner;
class MainCISI
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Amount:");
int amount=sc.nextInt();
System.out.println("enter the Intrest Rate:");
double intrestrate=sc.nextDouble();
System.out.println("enter the Time:");
int time=sc.nextInt();
double simpleintrest=amount*(intrestrate/100)*time;
System.out.println(simpleintrest);
}
}