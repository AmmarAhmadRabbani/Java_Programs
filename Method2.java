class Method2
{
public static void add()
{
int a=10;
int b=15;
int c=a+b;
System.out.println(c);
}
public static void mul()
{
int a=14;
int b=20;
int c=a*b;
System.out.println(c);
add();
}
public static void main(String[] args)
{
add();
System.out.println("ooooo");
mul();
System.out.println("kay");
}
}