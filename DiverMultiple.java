import java.util.Scanner;
class DiverMultiple
{
public static void main(String[] args)
{
int choice;
SBI ob=new SBI(36463456,2234,50000);

Scanner sc=new Scanner(System.in);
do{
System.out.println("1:withdraw");
System.out.println("2:balance check");
System.out.println("3:statement");
System.out.println("4:change pin");
System.out.println("ENTER THE OPTION");
int option=sc.nextInt();
switch(option)
{
case 1:{
ob.withdrawMoney();
break;
}
case 2:{
ob.checkBalance();
break;
}
case 3:{
ob.checkBalance();
break;
}
case 4:{
ob.changePin();
break;
}
default:
System.out.println("INVALID OPTION");
}
System.out.println("DO YOU WANT TO CONTINUE???? PRESS 1 TO CONTINUE");
choice=sc.nextInt();
}while(choice==1);
}
}



