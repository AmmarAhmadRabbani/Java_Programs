import java.util.Scanner;
class MainStr11
{
public static boolean isPalindrome(String str)
{
int i=0,j=str.length()-1;
while(i<j)
{
if(str.charAt(i)!=str.charAt(j))
{
return false;

j--;
}
}
return true;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
boolean rec=isPalindrome(str);
if(rec==true)
{
System.out.println("palindrome");
}
else
{
System.out.println("not");
}
}
}