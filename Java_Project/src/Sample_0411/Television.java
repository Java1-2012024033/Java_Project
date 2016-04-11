package Sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		if(onOff== false){
			System.out.println("TV Die");
			return;
		}
		System.out.println(channel+" "+volume+" "+onOff);
	}
	int volumeUP(int up_data){
		int vol=volume;
		vol += up_data;
		return vol;
	}
	void volUP(int data){
		if(onOff== false){
			System.out.println("TV Die");
			return;
		}
		volume+=data;
	}
	void volUP(){
		if(onOff== false){
			System.out.println("TV Die");
			return;
		}
		volume+=1;
	}
}
