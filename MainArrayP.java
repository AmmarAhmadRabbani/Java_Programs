class MainArrayP
{
public static void main(String[] args)
{
int a[]={10,30,43,23,66};
System.out.println("PRINT ELEMENTS OF AN ARRAY BY USING SIMPLE FOR LOOP");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println("PRINT ELEMENTS OF AN ARRAY BY USING FOR EACH LOOP");
for(int i:a)
{
System.out.print(i+ " ");
}
}
}