package chapter11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// �ڵ� Boxing
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());

		// ���Խ� �ڵ� Unboxing
		int value = obj;
		System.out.println("Value: " + value);

		// ����� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
