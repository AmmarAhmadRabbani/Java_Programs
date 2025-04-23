class ElseIfLadder1
{
public static void main(String[] args)
{
int age=24;
if((age>=2)&&(age<=4))
{
System.out.println("TODDER");
}
else if((age>0)&&(age<=1))
{
System.out.println("NEW BORN");
}
else if((age>4)&&(age<=12))
{
System.out.println("CHILD");
}
else if((age>12)&&(age<=19))
{
System.out.println("TEENAGE");
}
else if((age>19)&&(age<=60))
{
System.out.println("YOUNG");
}
else 
{
System.out.println("OLD");
}
}
}