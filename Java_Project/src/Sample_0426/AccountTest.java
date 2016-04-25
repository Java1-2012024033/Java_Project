package Sample_0426;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account(1,"2",3);
		System.out.println("이름은 " +ac1.getName()+" 통장 잔고는 "+ac1.getBalance()+" 입니다.");
		Account ac2 = new Account();
		System.out.println("이름은 " +ac2.getName()+" 통장 잔고는 "+ac2.getBalance()+" 입니다.");
		/*
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " +obj.getName()+" 통장 잔고는 "+obj.getBalance()+" 입니다.");
		*/
	}
}
