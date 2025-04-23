class MainEncapsulation
{
private int psd;
private String username;

public int getPsd()
{
return psd;
}
public String getUsername()
{
return username;
}
public void setPsd(int psd)
{
this.psd=psd;
}
public void setUsername(String username)
{
this.username=username;
}
public MainEncapsulation(int psd,String username)
{
this.psd=psd;
this.username=username;
}
}
