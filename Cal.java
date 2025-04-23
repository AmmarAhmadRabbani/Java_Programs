import java.util.Scanner;
class Cal
{
public static void main(String[] args)

{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int i=sc.nextInt();
System.out.println("Enter the secound number");
int j=sc.nextInt();
int sum;
sum=i+j;
System.out.println("sum of the number is "+sum);
int p=i*j;
System.out.println("product of the number is "+p);
int subs= i-j;
System.out.println("substraction of the number is "+subs);
}
}