import java.util.*;
class MainArrayList
{
public static void main(String[] args)
{
LinkedList<Object> ob=new LinkedList<Object>();
ob.add(200);
ob.add("java");
ob.add(34.5);
ob.add("Hello");
System.out.println("printing element is forward direction:");
ListIterator li=ob.listIterator();
while(li.hasNext())
{
System.out.println(li.next());
}
System.out.println("printing element backward:");
while(li.hasPrevious())
{
System.out.println(li.previous());
}
Object a=li.previous();
if(a=="hello")
li.remove();
}
}