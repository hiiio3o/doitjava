package example;

public class Asterisk02 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // row ��, ��
			for (int j = 0; j <= i - 1; j++) { // column ��, ĭ
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
