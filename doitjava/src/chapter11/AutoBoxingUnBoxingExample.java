package chapter11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());

		// 대입시 자동 Unboxing
		int value = obj;
		System.out.println("Value: " + value);

		// 연산시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
