import java.util.Scanner;
class Ola
{
public static void welcomeWish()
{
System.out.println("WELCOME TO OLA");
}
public static void ride()
{
System.out.println("YOUR RIDE IS READY");
}
}



class Prime extends Ola
{
int costprimekm=120;
public static void ride()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE KM:");
int km=sc.nextInt();
System.out.println("TOTAL COST IS :"+km*120);
}
public static void primeWish()
{
System.out.println("ENJOY YOUR PRIME RIDE,WELCOME BACK AGAIN");
}
}


class Mini extends Ola
{
int costperkm=50;
public static void ride()
{
System.out.println("YOUN ARE IN MINI OPTION");
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE KM :");
int km=sc.nextInt();
System.out.println("TOTAL COST :"+km*50);
}
public static void welcomeWish()
{
System.out.println("WELCOME TO MINI RIDE");
}
public static void miniWish()
{
System.out.println("ENJOY YOUR MINI RIDE,COME BACK US TO AGAIN");
}
}


class OlaApp
{
public static void main(String[] args)
{
Ola o=new Prime();
Ola.welcomeWish();
o.ride();
Prime p=(Prime)o;
p.primeWish();
}
}