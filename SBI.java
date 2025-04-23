import java.util.Scanner;
class SBI extends RBI implements ATM
{
Scanner sc=new Scanner(System.in);
int pin;
long acno;
double balance;
public SBI(int pin,long acno,double balance)//constructor
{
this.pin=pin;
this.acno=acno;
this.balance=balance;
}
public void printLoanIntrestRate()
{
System.out.println("7.6% is the intrest rate");
}
public void show()
{
System.out.println("SBI CLASS");
}
public void withdrawMoney()
{
System.out.println("ENTER YOUR PIN");
int p=sc.nextInt();
if(p==pin)
{
System.out.println("ENTER AMOUNT TO WITHDRAW:");
double amount=sc.nextDouble();
balance=balance-amount;
System.out.println("COLLECT YOUR MONEY");
}
else
{
System.out.println("YOU HAVE ENTERED WRONG PIN");
}
}
public void printStmnt()
{
System.out.println(acno);
System.out.println(balance);
}
public void changePin()
{
System.out.println("ENTER EXISTING PIN:");
int p=sc.nextInt();
if(p==pin)
{
System.out.println("ENTER YOUR NEW PIN");
this.pin=sc.nextInt();
System.out.println("YOUR PIN UPDATED SUCCESSFULLY");
}
else
{
System.out.println("WRONG PIN,TRY AGAIN");
}
}
public void checkBalance()
{
System.out.println("ENTER YOUR PIN:");
int p=sc.nextInt();
if(p==pin)
{
System.out.println("YOUR EXISTING BALANCE IS:"+balance);
}
else
{
System.out.println("WRONG PIN");
}
}
}
