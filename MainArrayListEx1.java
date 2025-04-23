import java.util.*;
class MainArrayListEx1
{
public static void main(String[] args)
{
ArrayList<String>ob=new ArrayList<String>();
ob.add("book");
ob.add("notebook");
ob.add("pen");
ob.add("pencil");
ob.add("marker");
//System.out.println("Printing before remove:"+ob);
/*System.out.println("Printing through for each:");
for(String i:ob)
{
System.out.println(i);
}
System.out.println("Printing through for loop:");
for(int i=0;i<=ob.size();i++)
{
System.out.println(ob.get(i));
} */
System.out.println("Printing after remove:");
Iterator<String>a=ob.iterator();
while(a.hasNext())
{
String s=a.next();
if(s=="pen")
{
a.remove();
}
a.next();
}
}
}
