import java.util.Scanner;
class MainTem
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Sytem.out.println("enter the temperature in calsious:");
float c=sc.nextFloat();
float far=(c*9/5)+31;
flaot kelvin=c+273.15;
System.out.println(far);
System.out.println(kelvin);
}
}
