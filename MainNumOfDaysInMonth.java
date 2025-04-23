import java.util.Scanner;
class MainNumOfDaysInMonth
{
public static int returnDays(int num)
{
if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
System.out.println("MONTH HAS 31 DAYS");
else if(num==4||num==6||num==9||num==11)
System.out.println("MONTH HAS 30 DAYS");
else if(num==2)
System.out.println("MONTH HAS 28 OR 29 DAYS");
else
System.out.println("INVALID INPUT");
}
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int days=returnDays(num);
}
}