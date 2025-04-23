class ECar extends Car
{
int chargecapacity;
public ECar(String brand,String regno,String model,String colour,String type,double price,int chargecapacity)
{
super(brand,regno,model,colour,type,price);
this.chargecapacity=chargecapacity;
}
public void printDetails()
{
System.out.println(brand);
System.out.println(regno);
System.out.println(model);
System.out.println(colour);
System.out.println(type);
System.out.println(price);
System.out.println(chargecapacity);
}
public static void main(String[] args)
{
Car ob1=new Car("HONDA","KA O1 8433","JAN-22","WHITE","AUTOMATIC",650000);
ob1.printVechile();
ob1.updatePrice(550000);
ECar ob2=new ECar("TATA","KA 01 3384","jan-20","RED","MANNUAL",560000,100000);
ob2.printDetails();
ob2.updatePrice(750000);
ob2.printDetails();
}
}

