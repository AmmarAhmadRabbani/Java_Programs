import java.util.*;
class StringHandleEx
{
public static void main(String[] args)
{
String country=null;
try
{
if(country.equals("India"))
{
System.out.println("Independent Nation Decleared In August");
}
else
{
System.out.println("invalid");
}
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("completed");
}
}