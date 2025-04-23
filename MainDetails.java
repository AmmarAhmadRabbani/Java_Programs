import java.util.Scanner;
class MainDetails
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
String name=sc.nextLine();
System.out.println("Enter your phno:");
long phno=sc.nextLong();
System.out.println("Enter you age:");
int age=sc.nextInt();
System.out.println("Enter your e-mail:");
String email=sc.nextLine();
System.out.println("your name is"+name);
System.out.println("your phone number is "+phno);
System.out.println("your age is "+age);
System.out.println("your emai id is "+email);
}
}