
abstract class Bank
{
	abstract void getBalance(int Bal);
	
}
class BankA extends Bank
{
	void getBalance (int Bal)
	{
		System.out.println("Bank A balance:-" +Bal);
	}
}
class BankB extends Bank
{
	void getBalance (int Bal)
	{
		System.out.println("Bank B balance:-"+Bal);
	}
}
class BankC extends Bank
{
	void getBalance (int Bal)
	{
		System.out.println("Bank C balance:-"+Bal);
	}
}

public class Abstract {

	public static void main(String[] args) {
		BankA a=new BankA();
        a.getBalance(500);
        BankB b=new BankB();
        b.getBalance(80000);
        BankC c=new BankC();
        c.getBalance(2500);
	}

}
