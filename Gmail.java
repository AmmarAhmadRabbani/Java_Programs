class Gmail
{
String username;
int password;

public Gmail(String username,int password)
{
this.username=username;
this.password=password;
}

public void changePassword(int newpassword)
{
if(password==newpassword)
this.password=password;
}
}