abstract class ESwitch
{
String switchbrand;
public ESwitch(String switchbrand)
{
this.switchbrand=switchbrand;
}
abstract void switchOn();
abstract void switchOff();
void display()
{
System.out.println("ELECTRIC SWITCH IS AN INTERMEDIATE BETWEEN ACTION AND SERVICE");
}
}
