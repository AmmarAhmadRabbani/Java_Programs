class MainExx
{
public static void main(String[] args)
{
String s="Karnataka";
int l=s.length();
System.out.println("The length of the given string literal is "+l);
System.out.println("converted into lowercase letter   "+s.toLowerCase());
System.out.println("converted into uppercase letters   "+s.toUpperCase());
System.out.println("Substring startin from index 3 "+s.substring(3));
System.out.println("Substring starting from 3 and ending at 7 "+s.substring(3,7));
String s2="KARNATAKA";
System.out.println(s==s2);
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));
String s3=s.concat(s2);
System.out.println("resulting string is:"+s3);
char c=s.charAt(3);
System.out.println("character at index 3 is: "+c);
int index=s.indexOf('r');
System.out.println("index value of r  "+index);
String s4=" India ";
System.out.println("The length of the given string before trim "+s4.length());
String s5=s4.trim();
System.out.println("The length of the given string after trim is "+s5.length());
String place="Delhi";
char[] crr=place.toCharArray();
System.out.println("printing array");
for(char cc:crr)
{
System.out.println(cc);
}
System.out.println(s.lastIndexOf('a'));
System.out.println(s.indexOf('k',2));

}
}









