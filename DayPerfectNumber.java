import java.util.Scanner;
class DayPerfectNumber{
public static void main(String[] arga){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int d1=num%10;
int d2=num/10;
int sum=d1+d2+d1*d2;
if(sum==num){
System.out.println("number is special number");
}else{
System.out.println("number is not a special number");
}
}
}