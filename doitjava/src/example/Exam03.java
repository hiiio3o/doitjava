package example;

public class Exam03 {

	public static void main(String[] args) {
		int cnt = 1;
		int res = 0;
		
		while(cnt<=10) {
			res += cnt++;
		}
		System.out.println("1���� 10������ �հ�� " + res + "�Դϴ�.");
		
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while (num<=10);
		
		System.out.println("1���� 10������ �հ�� " + sum + "�Դϴ�.");
		
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 += i;
		}
		
		System.out.println("1���� 10������ ���� " + sum1 + "�Դϴ�.");
	}

}
