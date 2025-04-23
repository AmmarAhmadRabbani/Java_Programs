class DriverSBIApp
{
public static void main(String[] args)
{
SBI ob= new SBI(1212,76843732l,30000d);
ob.show();
ob.checkBalance();
ob.withdrawMoney();
ob.changePin();
ob.printLoanIntrestRate();
}
}