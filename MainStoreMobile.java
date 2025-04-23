import java.util.*;
class MainStoreMobile
{
public static void main(String[] args)
{
HashSet<MobileHashSet>hs=new HashSet<MobileHashSet>();
//HashSet<Object>hs=new HashSet<Object>();
hs.add(new MobileHashSet("apple",1000000d));
hs.add(new MobileHashSet("vivo",70000d));
hs.add(new MobileHashSet("oppo",34566d));
System.out.println("printing through for each");
for(Object i:hs)
{
System.out.println(i);
}
System.out.println("printing through iterstor:");
//Iterator<Object>o= hs.iterator();
Iterator<MobileHashSet>o= hs.iterator();
while(o.hasNext())
{
System.out.println(o.next());
}
}
}
