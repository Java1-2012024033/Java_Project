package Sample_0426;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account(1,"2",3);
		System.out.println("�̸��� " +ac1.getName()+" ���� �ܰ�� "+ac1.getBalance()+" �Դϴ�.");
		Account ac2 = new Account();
		System.out.println("�̸��� " +ac2.getName()+" ���� �ܰ�� "+ac2.getBalance()+" �Դϴ�.");
		/*
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("�̸��� " +obj.getName()+" ���� �ܰ�� "+obj.getBalance()+" �Դϴ�.");
		*/
	}
}
