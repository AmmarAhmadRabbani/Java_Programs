class DivisiorSum
{
public static int sumDivisior(int n)
{

int sum=0;
for(int i=1;i<=n/2;i++)
if(n%i==0)
{
sum=sum+i;
}
return sum;
}

public static void main(String[] args)
{
int c1=sumDivisior(50);
System.out.println(c1);

int c2=sumDivisior(10);
System.out.println(c2);
}
}
