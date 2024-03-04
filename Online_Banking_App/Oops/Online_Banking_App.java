package Oops;

public class Online_Banking_App {
   String customerName;
   int accountNumber;
   String customerEmail;
   double balance;
   int PhoneNumber;
   int depositeMoney;
   int withdrewMoney;
   public Online_Banking_App(String customerName,int accountNumber,String customerEmail, double balance, int PhoneNumber)
   {
	   this.customerName=customerName;
	   this.accountNumber=accountNumber;
	   this.customerEmail=customerEmail;
	   this.balance=balance;
	   this.PhoneNumber=PhoneNumber;
   }
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getDepositeMoney() {
		return depositeMoney;
	}
	public void setDepositeMoney(int depositeMoney) {
		this.depositeMoney = depositeMoney;
	}
	public int getWithdrewMoney() {
		return withdrewMoney;
	}
	public void setWithdrewMoney(int withdrewMoney) {
		this.withdrewMoney = withdrewMoney;
	}
	public void depositedMoney(int depositeMoney)
	{
		this.balance+=depositeMoney;
		System.out.println("The available balance is "+this.balance);
	}
	public void withdrew_Money(int withdrewMoney)
	{
		if(this.balance-withdrewMoney < 0)
		{
			System.out.println("Withdrew unsuccessful, Only "+ this.balance+" is available");
		}
		else
		{
			this.balance-=withdrewMoney;
			System.out.println("Withdrew successful, The available balance is "+this.balance);
		}
	}
	   
}
