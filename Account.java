package accountExam;

public class Account {
	public String name;
	private int no;
	private int balance;
	
	public Account() {}
	public Account(String name, int no)
	{
		this.name=name;
		this.no=no;
	}
	public Account(String name, int no, int balance)
	{
		this(name, no);
		this.balance=balance;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getNo()
	{
		return no;
	}
	public void setNo(int no)
	{
		this.no=no;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public void deposit(int money)
	{
		balance=balance+money;
		System.out.println(name+"님 "+money+"원 입금");
	}
	public void withdraw(int money)
	{
		if(balance<money)
		{
			
			System.out.println(name+"님 "+money+"원 출금 실패=현제잔액"+money+"원");
		}
		else
		{
			balance=balance-money;
			System.out.println(name+"님 "+money+"원 출금");
		}
	}
	public void printInfo()
	{
		System.out.println("[계좌정보] 예금주:"+name+" 계좌번호: "+no+" 현재잔고:"+balance);
	}
	
	

}
