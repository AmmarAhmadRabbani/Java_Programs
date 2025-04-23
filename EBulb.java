class EBulb extends ESwitch
{
String brand;
float price;
public EBulb(String switchbrand,String brand,float price)
{
super(switchbrand);
this.brand=brand;
this.price=price;
}
void switchOn()
{
System.out.println("ELECTRIC BULB IS ON");
}
void switchOff()
{
System.out.println("ELECTRIC BULB IS OFF");
}
void display()
{
System.out.println(switchbrand);
System.out.println(brand);
System.out.println(price);
}
public static void main(String[] args)
{

EBulb e=new EBulb("ANCHOR","HAVELS",250);
e.switchOn();
e.switchOff();
e.display();

}
}