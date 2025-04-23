import java.util.ArrayList;
class ListEx3
{
public static void main(String[] args)
{
ArrayList<Object>ob=new ArrayList<Object>();
ob.add(100);
ob.add("java");
ob.add("hello");
ob.add(2.45);
ob.add('d');
System.out.println(ob);
ArrayList<Integer>ob1=new ArrayList<Integer>();
ob1.add(400);
ob.addAll(ob1);
System.out.println(ob);
ob.remove(4);
System.out.println(ob.contains('d'));
System.out.println(ob.size());
ob.add(1,"SQL");
for(Object i:ob)
{
System.out.println(i);
}


}
}
