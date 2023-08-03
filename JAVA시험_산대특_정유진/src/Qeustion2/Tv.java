package Qeustion2;

public class Tv {

	
	String color;
	int channel;


	public static void main(String[] args) {

		Tv t = new Tv();
		
		t.channel = 7;
		t.color = "red";
		t.print(); //현재 Tv의 상태 출력
		t.channelUp();
		t.channelUp();
		t.print();
		t.color = "black";
		t.channelDown();
		t.print();
		
		
	}
	public Tv(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}

	public Tv() {
	}

	public void print() {
		System.out.println("Tv의 현재 채널은 : " + channel + "이고, Tv의 색깔은 " + color+ " 입니다.");
	}
	
	public void channelUp() {
		channel +=1;
	}
	
	public void channelDown() {
		channel -=1;
	}
	
	
	
}
