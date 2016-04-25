package Sample_0426;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	/*
	Account(){
		regNumber = 1;
		name = "abc";
		balance = 2;
	}
	*/
	
	Account(int regNumber, String name, int balance){
		this.regNumber = regNumber;
		this.name = name;
		this.balance = balance;
	}
	
	Account(){this(1,"2",3);}//p261 Account가 Account를 다시 부를 수 없다.
	
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name; }
	public int getBalance() {	return balance;	}
	public void setBalance(int balance) {	this.balance = balance;	}
}