class PersonMethod
{
int age;
String nationality;
String state;
double pincode;
public static void main(String[] args)
{
PersonMethod p1=new PersonMethod();
p1.age=18;
p1.nationality="INDIA";
p1.state="BIHAR";
p1.pincode=843302d;

PersonMethod p2=new PersonMethod();
p2.age=34;
p2.nationality="INDIA";
p2.state="DELHI";
p2.pincode=800001d;


PersonMethod p3=new PersonMethod();
p3.age=54;
p3.nationality="INDIA";
p3.state="JK";
p3.pincode=500923d;


p1.displayDetails();
p2.displayDetails();
p3.displayDetails();
}



public void displayDetails()
{
System.out.println(age);
System.out.println(nationality);
System.out.println(state);
System.out.println(pincode);
}
}	
