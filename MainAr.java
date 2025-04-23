class MainAr
{
public static void main(String[] args)
{
int n[]={10,30,22,34,11};
int sum=0;
System.out.println("use for loop");
for(int i=0;i<n.length;i++)
{
sum=sum+n[i];
}
System.out.println("sum of an element:"+sum);

System.out.println("use for each loop");
int s=0;
for(int i:n)
{
s=s+i;
}
System.out.println(s);
}
}
