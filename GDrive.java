class GDrive extends Gmail
{
int pin;
public GDrive(String username,int password,int pin)
{
super(username,password);
this.pin=pin;
}
public void uploadFile()
{
System.out.println("upload a file:");
}
public void viewProfile()
{
System.out.println(username);
System.out.println(password);
System.out.println(pin);
}
public int changePin(int newpin)
{
 if(pin== newpin)
{
 pin=newpin;
}
return pin;
}


public static void main(String[] args)
{
GDrive gd=new GDrive("ammarahmadrabbani",1234511,0011);
gd.viewProfile();
}
}