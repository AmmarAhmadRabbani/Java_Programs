import java.util.Iterator;
import java.util.HashSet;
class MainHashSetEx1
{
public static void main(String[] args)
{
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(100);
hs.add(200);
hs.add(300);
hs.add(400);
hs.add(100);
hs.add(500);
System.out.println("printing the elements using for each:");
for(Integer i:hs)
{
System.out.println(i);
}
System.out.println("printing the elements using Iterator:");
Iterator<Integer> ob= hs.iterator();
while(ob.hasNext())
{
System.out.println(ob.next());
}
}
}