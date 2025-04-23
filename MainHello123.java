
import java.util.Scanner;
class MainHello123
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character from use");
char c=sc.next().charAt(0);
char ch[]={'a','p','p','l','e'};
for(int i=0;i<ch.length;i++)
{
if(ch[i]==c)
{
System.out.println("found");
}
else
{
System.out.println("not found");
}
}
}
}