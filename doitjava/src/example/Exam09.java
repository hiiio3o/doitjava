package example;

public class Exam09 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {
			sum += i;
		}
		double res = (double)sum/50;
		System.out.println("1부터 50까지 합의 평균 = " + res);
		

	}

}
