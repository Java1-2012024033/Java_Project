package Sample_0411;

public class TelevisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = true;
		//mytv.onOff = false;
		
		mytv.volume = mytv.volumeUP(30);
		
		yourtv.channel = 27;
		yourtv.volume = 28;
		yourtv.onOff = true;
		
		yourtv.volUP();
		
		//System.out.println(mytv.channel+" "+mytv.volume+" "+mytv.onOff);
		//System.out.println(yourtv.channel+" "+yourtv.volume+" "+yourtv.onOff);
		//mytv.channel = 231;
		//testtv=null;
		//System.out.println(testtv.channel+" "+testtv.volume+" "+testtv.onOff);
		mytv.pr();
		yourtv.pr();
		testtv.pr();
		
	}

}
