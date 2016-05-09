package Sample_0509;
abstract class Animal2{//추상클래스
	abstract void sound();/*{
		System.out.println("Ani");
	}
	void eat(){
		System.out.println("ani eat");
	}
	*/
}

class Dog extends Animal2{
	private int d = 11;
	@Override
	void sound(){
		System.out.println("Dog"+d);
	}
}

class Cat extends Animal2{
	private int c = 99;
	@Override
	void sound(){
		System.out.println("Cat"+c);
	}
}

public class Dynamic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal2 a = new Animal2();//추상클래스는 객체 못만든다!!!!
		Animal2 b = new Dog();
		Animal2 c = new Cat();
		//a.sound();
		b.sound();
		c.sound();
		//test(a);
		test(b);
		test(c);
	}
	
	static void test(Animal2 temp){
		temp.sound();
	}

}
