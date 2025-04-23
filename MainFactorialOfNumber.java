import java.util.Scanner;
class MainFactorialOfNumber
{
static int sumOfFactorial(int num)
{
int fact=1;
while(num>1)
{
fact=fact*num;
num--;
}
return fact;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int rec=sumOfFactorial(num);
System.out.println("FACTORIAL OF A NUMBER IS: "+rec);
}
}