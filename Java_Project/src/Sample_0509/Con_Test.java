package Sample_0509;

class Par{
	Par(){System.out.println("Par con");}
	Par(int x){System.out.println("Par con"+x);}
}
	
class child extends Par{
	public child(int y) {
		super(y);//명시적 호출, 적어도 되고 안적어도 됨, 특정 생성자 알려주고싶을때 쓴다.
		System.out.println("child con");
	}
	public child() {System.out.println("child con nothing");}
}


public class Con_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child(5);
		child c2 = new child();
	}

}
