package chapter09;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void strtCar() {
		System.out.println("�õ��� �մϴ�");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	final public void run() {
		strtCar();
		drive();
		stop();
		turnOff();
	}
}
