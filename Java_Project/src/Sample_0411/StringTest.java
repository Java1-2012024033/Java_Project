package Sample_0411;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String proverb = "A Barking dog";
		String s1, s2, s3, s4, s5;
		
		System.out.println(proverb);
		System.out.println("문자열의 길이 ="+proverb.length());
		
		s1 = proverb.concat("never Bites!");
		s2 = proverb.replace('B','b');
		s3 = proverb.substring(2,9);
		s4 = proverb.toUpperCase();
		s5 = proverb.toLowerCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
