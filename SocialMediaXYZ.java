class SocialMediaXYZ extends YahooAccount
{
String ageproof;
public void viewYourProfile()
{
super.viewYourProfile();
System.out.println("you have submitted"+ageproof+"for verification");
System.out.println("contact number:"+phno);
System.out.println("username:"+username);
System.out.println("password:"+password);
}
public static void main(String[] args)
{
SocialMediaXYZ s=new SocialMediaXYZ();
s.username="RAJ@123";
s.password="Raj@King1234";
s.phno=88779965;
s.ageproof="voterid";
s.viewYourProfile();
}
}