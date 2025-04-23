import java.util.*;
class MainHashMapEx
{
public static void main(String[] args)
{
HashMap<String,Object>hm=new HashMap<String,Object>();
hm.put("name","ajay");
hm.put("eid",202);
hm.put("contactno",783582322);
hm.put("salary",45329.4);
System.out.println(hm);
System.out.println(hm.values());
System.out.println(hm.keySet());
}
}