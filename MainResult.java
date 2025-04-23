import java.util.Scanner;
class MainResult
{
public static String getResult(int p,int c,int m,int b)
{
int per;
if(p<35||c<35||m<35||b<35)
return "fail";
else
per=(p+c+b+m)/4;
if(per>=85)
return "Distinction";
else if(per>=60)
return "first class";
else if(per>=50)
return "second class";
else
return"pass";
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE FOUR SUBJECT MARKS:");
int math=sc.nextInt();
int phy=sc.nextInt();
int chem=sc.nextInt();
int bio=sc.nextInt();
String rs=getResult(math,phy,chem,bio);
System.out.println(rs);
}
}
