class StudentOverLoading
{
int id;
String name;
float percentage;
String place;
long contact;
public StudentOverLoading()
{
System.out.println("CONSTRUCTOR WITHOUT ANY ARGUMENTS IS EXECUTING");
}
public StudentOverLoading(int id,String name,float percentage,String place,long contact)
{
System.out.println("CONSTRUCTIR WITH ALL OF ITS ARGUMERNTS");
this.id=id;
this.name=name;
this.percentage=percentage;
this.place=place;
this.contact=contact;
}
public StudentOverLoading(int id,String name,long contact)
{
System.out.println("CONSTRUCTOR WITH THREE ARGUMENTS");
this.id=id;
this.name=name;
this.contact=contact;
}
public StudentOverLoading(String place,long contact)
{
System.out.println("CONSTRUCTOR WITH TWO ARGUMENTS");
this.place=place;
this.contact=contact;
}
public StudentOverLoading(int id,float percentage,String place,String name)
{
System.out.println("CONSTRUCTOR WITH THREE ARGUMENTS");
this.id=id;
this.percentage=percentage;
this.place=place;
this.name=name;
}
public static void printDetails()
{
System.out.println(id);
System.out.println(name);
System.out.println(percentage);
System.out.println(place);
System.out.println(contact);
}
public static void main(String[] args)
{
StudentOverLoading s1=new StudentOverLoading();
StudentOverLoading s2=new StudentOverLoading(101,"srk",67.4f,"delhi",99887766);
StudentOverLoading s3=new StudentOverLoading(102,"salman",44332211);
StudentOverLoading s4=new StudentOverLoading("patna",77889900);
StudentOverLoading s5=new StudentOverLoading(105,76.4f,"puna","imran");
s1.printDetails();
s2.printDetails();
s3.printDetails();
s4.printDetails();
s5.printDetails();
}
}

