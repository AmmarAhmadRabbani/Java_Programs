import java.util.Scanner;
class Account
{
private int pin;
long accno;
public int getPin()
{
return pin;
}
pulic void setPin(int pin)
{
System.out.println("enter existing pin:");
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
if(p==this.pin)
{
this.pin=pin;
}
}
public Account(int pin,long accno)
{
this.int=int;
this.accno=accno;
}
}

