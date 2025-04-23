class MainArray
{
public static void main(String[] args)
{
OperationPrime pr=new OperationPrime();
int x=pr.readArray();
System.out.println("USER ENTER ARRAY");
pr.dispArraya(x);
System.out.println(pr.countPrimeNum(x));
}
}