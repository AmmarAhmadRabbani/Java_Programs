class Car extends VechileSecond
{
String model;
String colour;
String type;
double price;

public Car(String brand,String regno,String model,String colour,String type,double price)
{
super(brand,regno);
this.model=model;
this.colour=colour;
this.type=type;
this.price=price;
}
public void updatePrice(double price)
{
this.price=price;
System.out.println("car price is updated:"+price);
}
}