import java.util.ArrayList;
class ListEx1
{
public static void main(String[] args)
{
ArrayList<Integer>ob=new ArrayList<Integer>();
 ob.add(100);
ob.add(10);
ob.add(100);
ob.add(15);
ob.add(200);
ob.add(13);
ob.add(102);
System.out.println(ob);
System.out.println("THE SIZE OF THE LIST: "+ob.size());
ob.add(2,589);
System.out.println(ob);
System.out.println("THE SIZE OF THE LIST: "+ob.size());
ArrayList<Integer>ob1=new ArrayList<Integer>();
ob1.add(13);
ob1.add(45);
ob1.addAll(ob);
System.out.println(ob1);
System.out.println("THE SIZE OF THE LIST: "+ob1.size());
ob1.addAll(2,ob);
System.out.println(ob1);
System.out.println("THE SIZE OF THE LIST: "+ob1.size());
}
}
