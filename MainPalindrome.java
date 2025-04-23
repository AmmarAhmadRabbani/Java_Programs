import java.util.Scanner;
class MainPalindrome
{
static boolean isPalindrome(int n)
{
int rev=0,temp=n;
while(n>0)
{
int d=n%10;
rev=rev*10+d;
n=n/10;
}
if(rev==temp)
return true;
else
return false;
//return rev==temp;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int num=sc.nextInt();
boolean rec=isPalindrome(num);
if(rec==true)
System.out.println("NUMBER IS PALINDROME");
else 
System.out.println("NUMBER IS NOT A PALINDROME");
}
}