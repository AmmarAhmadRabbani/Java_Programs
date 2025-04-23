class NestedIf1
{
public static void main(String[] args)
{
int n=30;
if(n<50)
{
System.out.println("The number is less than 50");
if((n<=40)&&(n>=20))
{
System.out.println("The given number comes between the rane of 20 and 40");
System.out.println("Multiply the number by 2,we get" +n*2);
}
else
{
System.out.println("The given number is not in between the range of 20 and 40");
}
}
else 
{
System.out.println("The number is not less than 50");
}
}
}

