class EmployeeBtmQJ
{
int empid;
String name;
String designation;
long phno;
double salary;
static String headoffice="Test Yantra";

public static void main(String[] args)
{
EmployeeBtmQJ e1=new EmployeeBtmQJ();

e1.empid=202;
e1.name="Roan";
e1.salary=70000d;
e1.designation="Qspider java trainer";
e1.phno=8989898989l;


EmployeeBtmQJ e2=new EmployeeBtmQJ();

e2.empid=203;
e2.name="soan";
e2.salary=70000d;
e2.designation="Jspider java trainer";
e2.phno=89898989892l;

EmployeeBtmQJ e3=new EmployeeBtmQJ();

e1.displayDetails();
e2.displayDetails();
e3.displayDetails();

}
public void displayDetails()
{
System.out.println(name);
System.out.println(salary);
System.out.println(empid);
System.out.println(designation);
System.out.println(headoffice);
System.out.println(phno);
}

}