package chapter08;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel = 0;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model; // CellPhone 상속 필드
		this.color = color; // CellPhone 상속 필드
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
