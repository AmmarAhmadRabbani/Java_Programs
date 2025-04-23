class EdibleProduct extends Product
{
String cateogry;
int quantity;

public EdibleProduct(String brand,int price,String cateogry,int quantity)
{
super(brand,price);
this.cateogry=cateogry;
this.quantity=quantity;
}

public void itemProfile()
{
System.out.println(brand);
System.out.println(price+"rs");
System.out.println(cateogry);
System.out.println(quantity+"gm");
}

public static void main(String[] args)
{
EdibleProduct ob1=new EdibleProduct("nestle",300,"chocolate",100);
EdibleProduct ob2=new EdibleProduct("parle",240,"biscuits",150);
ob1.itemProfile();
ob2.itemProfile();
}
}