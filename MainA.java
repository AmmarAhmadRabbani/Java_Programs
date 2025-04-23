class MainA
{
public static void add(int x,int y)
{
System.out.println(x+y);
}
public static void add(int x,int y,int z)
{
System.out.println(x+y+z);
}
/*public static void add(int a,int b)
{
System.out.println(a+b);
}*/
public static void add(int x)
{
System.out.println(x+22);
}
public static void add()
{
System.out.println(234);
}
/*public static void add(int x)
{
System.out.println(x+234);
}*/
/*public static void add(int x,int y)
{
System.out.println(x+y);
}*/
public static void main(String[] args)
{
add(55,22,44);
add(23,12);
add();
add(100);
add(34,23);
add(33,55,56);
}
}