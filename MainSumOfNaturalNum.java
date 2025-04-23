import java.util.Scanner;
class MainSumOfNaturalNum
{
static int sumOfNatural(int num)
{
int sum=0;
for(int i=0;i<num;i++)
sum=sum+i;
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
int rec=sumOfNatural(num);
System.out.println("SUM OF NATURAL NUMBERS IS:"+rec);
}
}