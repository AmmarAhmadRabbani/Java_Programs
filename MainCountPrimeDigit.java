import java.util.Scanner;
class MainCountPrimeDigit
{
public static int countPrime(int num)
{
int count=0;
while(num>0)
{
int d=num%10;
if(d==1||d==2||d==3||d==5||d==7)
count++;
num=num/10;
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int rec=countPrime(num);
System.out.println("number of prime numbers are :"+rec);
}
}








