import java.util.ArrayList;
class ListEx2
{
public static void main(String[] args)
{
ArrayList<Object>ob=new ArrayList<Object>();
ob.add("SQL");
ob.add("Java");
ob.add("SQL");
ob.add("API");
ob.add(100);
for(Object i:ob)
{
System.out.println(i);
}
ob.remove(3);//removing element at index 3
System.out.println(ob);
System.out.println(ob.contains("ava"));
System.out.println(ob.get(3));//getting element at index 3
}
}
