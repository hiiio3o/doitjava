package example;

public class Exam03 {

	public static void main(String[] args) {
		int cnt = 1;
		int res = 0;
		
		while(cnt<=10) {
			res += cnt++;
		}
		System.out.println("1에서 10까지의 합계는 " + res + "입니다.");
		
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while (num<=10);
		
		System.out.println("1에서 10까지의 합계는 " + sum + "입니다.");
		
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum1 + "입니다.");
	}

}
